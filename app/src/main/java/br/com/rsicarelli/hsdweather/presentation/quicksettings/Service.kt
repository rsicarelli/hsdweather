package br.com.rsicarelli.hsdweather.presentation.quicksettings

import android.annotation.SuppressLint
import android.service.quicksettings.Tile
import android.service.quicksettings.TileService
import android.util.Log
import android.widget.Toast
import br.com.rsicarelli.hsdweather.R
import java.util.*

class Service : TileService() {

    companion object {
        private const val SERVICE_STATUS_FLAG = "serviceStatus"
        private val PREFERENCES_KEY = "com.google.android_quick_settings"
    }

    override fun onClick() {
        Log.d("QS", "Tile tapped")

        Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show()
    }

    // Changes the appearance of the tile.
    @SuppressLint("NewApi")
    private fun updateTile() {
        val tile = this.qsTile

        val newLabel: String
        val newState: Int

        newLabel = String.format(Locale.US, "%s", getString(R.string.app_name))

        newState = Tile.STATE_ACTIVE

        // Change the UI of the tile.
        tile.label = newLabel
        tile.state = newState

        // Need to call updateTile for the tile to pick up changes.
        tile.updateTile()
    }

}