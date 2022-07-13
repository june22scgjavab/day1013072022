package com.infosys.objectdemo;

import java.util.Objects;

public class Computer {
	private int computerId;
	private String make;
	private int memory;
	private int hardDiskCapacity;

	/**
	 * 
	 */
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param computerId
	 * @param make
	 * @param memory
	 * @param hardDiskCapacity
	 */
	public Computer(int computerId, String make, int memory, int hardDiskCapacity) {
		super();
		this.computerId = computerId;
		this.make = make;
		this.memory = memory;
		this.hardDiskCapacity = hardDiskCapacity;
	}

	/**
	 * @return the computerId
	 */
	public int getComputerId() {
		return computerId;
	}

	/**
	 * @param computerId the computerId to set
	 */
	public void setComputerId(int computerId) {
		this.computerId = computerId;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the memory
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * @param memory the memory to set
	 */
	public void setMemory(int memory) {
		this.memory = memory;
	}

	/**
	 * @return the hardDiskCapacity
	 */
	public int getHardDiskCapacity() {
		return hardDiskCapacity;
	}

	/**
	 * @param hardDiskCapacity the hardDiskCapacity to set
	 */
	public void setHardDiskCapacity(int hardDiskCapacity) {
		this.hardDiskCapacity = hardDiskCapacity;
	}

	@Override
	public int hashCode() {
		return Objects.hash(computerId, hardDiskCapacity, make, memory);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Computer other = (Computer) obj;
		return computerId == other.computerId && hardDiskCapacity == other.hardDiskCapacity
				&& Objects.equals(make, other.make) && memory == other.memory;
	}

	@Override
	public String toString() {
		//return "Computer [computerId=" + computerId + ", make=" + make + ", memory=" + memory + ", hardDiskCapacity="
		//		+ hardDiskCapacity + "]";
	return "computer id: "+computerId+"\n make: "+make+"\n memory "+memory;
			
	} 

	
	

}
