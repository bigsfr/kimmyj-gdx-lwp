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

import android.media.AudioManager;
import android.media.SoundPool;

import com.badlogic.gdx.audio.Sound;

final class AndroidSoundLW implements Sound {
	final SoundPool soundPool;
	final AudioManager manager;
	final int soundId;

	AndroidSoundLW (SoundPool pool, AudioManager manager, int soundId) {
		this.soundPool = pool;
		this.manager = manager;
		this.soundId = soundId;
	}

	@Override public void dispose () {
		soundPool.unload(soundId);
	}

	@Override public long play () {
		return play(1);
	}

	@Override public long play (float volume) {
// int streamVolume = manager.getStreamVolume(AudioManager.STREAM_MUSIC);
		return soundPool.play(soundId, volume, volume, 1, 0, 1);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long loop() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long loop(float volume) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void stop(long soundId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLooping(long soundId, boolean looping) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPitch(long soundId, float pitch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(long soundId, float volume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPan(long soundId, float pan, float volume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long play(float volume, float pitch, float pan) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long loop(float volume, float pitch, float pan) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPriority(long soundId, int priority) {
		// TODO Auto-generated method stub
		
	}

}
