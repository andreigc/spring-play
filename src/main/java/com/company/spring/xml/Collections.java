package com.company.spring.xml;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collections {

	Properties p;
	List<String> l;
	Map<String, String> m;
	Set<String> s;
	
	public Properties getP() {
		return p;
	}
	public List<String> getL() {
		return l;
	}
	public Map<String, String> getM() {
		return m;
	}
	public Set<String> getS() {
		return s;
	}
	public void setP(Properties p) {
		this.p = p;
	}
	public void setL(List<String> l) {
		this.l = l;
	}
	public void setM(Map<String, String> m) {
		this.m = m;
	}
	public void setS(Set<String> s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "Collections [p=" + p + ", l=" + l + ", m=" + m + ", s=" + s + "]";
	}
	
	
	
	
}
