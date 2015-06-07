package com.sixthc.hbm;

import org.apache.log4j.Logger;

public class Constraint {

	private Class parentClass;
	private static org.apache.log4j.Logger log;

	public Constraint(Class c) {
		parentClass = c;
		log = Logger.getLogger(parentClass);
	}

	public void check(String name, String value, boolean nullable, int maxLength)
			throws ConstraintException {
		;
		log.debug(parentClass.getCanonicalName() + "." + name + " : " + value);
		if (nullable == false && value == null) {
			throw new ConstraintException(parentClass.getCanonicalName() + "." + name + " not nullible");
		}

		if (value != null && value.length() > maxLength)
			throw new ConstraintException(parentClass.getCanonicalName() + "." + name + " max length of " + maxLength + " exceeded");
	}
}
