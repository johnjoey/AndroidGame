package com.johncroker.framework;

public interface Music {
	public void play();
	public void stop();
	public void pause();
	public void setVolume(float volume);
	public void setLooping(boolean looping);
	public boolean isPlaying();
	public boolean isStopped();
	public boolean isLooping();
	public void dispose();
	void seekBegin();
}
