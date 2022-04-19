package com.tns.generics;

import java.util.ArrayList;
import java.util.List;

class KIA
{
	private int Vehicle;

	public KIA(int vehicle) {
		Vehicle = vehicle;
	}

	public int getVehicle() {
		return Vehicle;
	}

	@Override
	public String toString() {
		return "KIA [Vehicle=" + Vehicle + "]";
	}
	public void info()
	{
		System.out.println("ID is: "+getVehicle());
	}
}
class Seltos extends KIA
{
	private String CarModel;
	public Seltos(int vehicle, String carModel) 
	{
		super(vehicle);
		CarModel = carModel;
	}
	public String getCarModel() {
		return CarModel;
	}

	@Override
	public String toString() {
		return "Seltos [CarModel=" + CarModel + "]";
	}	
	@Override
	public void info()
	{
		System.out.println("ID is: "+getVehicle());
	}
}
public class Example
{
	public static void disp(List<? extends KIA> list)
	{
		for(KIA i:list)
			i.info();
	}
	public static void main(String[] args) 
	{
		List<KIA> list = new ArrayList<>();
		list.add(new KIA(1));
		list.add(new KIA(2));
		list.add(new KIA(3));
		list.add(new KIA(4));
		list.add(new KIA(5));
		list.add(new Seltos(5,"Seltos"));
		list.add(new Seltos(6,"Sonet"));
		disp(list);
	}
}