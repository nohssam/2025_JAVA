package com.ict.day06;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// 객체 직렬화 2번째 방법 
// 1. Externalizable 상속 받는다.
// 2. 추상메서드 2개 구현 해야 된다.
public class Ex01_VO implements Externalizable{
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private double weight;
	private boolean gender;

	// Externalizable 에서는 역직렬할때 기본생성자가 필요하다. 이유? 알아보기 
	// 역직렬화 과정에서 JVM이 먼저 기본 생성자로 객체를 생성한 후 readExternal()를 실행하므로
	// 기본생성자가 반드시 필요하다 
	// Serializable 는 JVM이 자동으로 직결화된 데이터를 이용해 객체글 생성하고, 복원하다.
	// Externalizabledms 객체를 직접 생성하고 데이터를 복원하는 방식에서 기본생성자가 필요하다
	public Ex01_VO() {}
	public Ex01_VO(String name, int age, double weight, boolean gender) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// 직렬화 대상 멤버을 넣기
		// writeExternal, readExternal 배치 순서가 같아야 한다.
		out.writeObject(name);
		out.writeObject(age);
		out.writeObject(weight);
		out.writeObject(gender);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// 역직렬화 대상 멤버를 넣기
		name = (String) in.readObject();
		age = (int) in.readObject();
		weight = (double) in.readObject();
		gender = (boolean) in.readObject();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
}
