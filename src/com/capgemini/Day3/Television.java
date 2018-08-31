package com.capgemini.Day3;

public class Television {
	private boolean state;
	private int volume;
	private int channel;
	private int newValue;

	public Television(boolean state, int channel, int volume, int newValue) {
		this.state = state;
		this.channel = channel;
		this.volume = volume;
		this.newValue = newValue;
	}

	public boolean state() {
		state = true;
		return state;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int increaseVolume() {
		volume = volume + 1;
		return volume;
	}

	public int decreaseVolume() {
		volume = volume - 1;
		return volume;
	}

	public int changeChannel() {
		if (state == true) {
			channel = newValue;
		}
		return newValue;

	}

	public void dispalyCurrentStatus() {
		System.out.println("state " + state + "volume" + volume + "channel" + channel);
	}
}
