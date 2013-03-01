/*
 * Copyright 2010 Mario Zechner (contact@badlogicgames.com), Nathan Sweet (admin@esotericsoftware.com)
 * 
 * Modified by Elijah Cornell
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package com.badlogic.gdx.backends.android.livewallpaper;


public interface AndroidTouchHandlerLW {
	public void onDragged(int pX, int pY, AndroidInputLW input);
	
	public void onDown(int pX, int pY, AndroidInputLW input);
	
	
	
	public void onTap (int pX, int pY, AndroidInputLW input);

	public void onDrop(int pX, int pY, AndroidInputLW input);
}
