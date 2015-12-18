package com.johncroker.framework;

import com.johncroker.framework.Graphics.ImageFormat;

public interface Image {
	public int getWidth();
	public int getHeight();
	public ImageFormat getFormat();
	public void dispose();
}
