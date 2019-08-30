/*
 * Overhaul your Jukebox experiences by using CustomJukebox!
 *     Copyright (C) 2019  Azortis
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.azortis.customjukebox;

import com.azortis.azortislib.AzortisLib;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomJukebox extends JavaPlugin {

    private AzortisLib azortisLib;
    private Metrics metrics;

    @Override
    public void onEnable(){
        this.azortisLib = new AzortisLib(this, "CustomJukebox", "§6[§eCustomJukebox§6]§r");
        this.metrics = new Metrics(this);

    }

    @Override
    public void onDisable(){
        azortisLib.close();
    }
}
