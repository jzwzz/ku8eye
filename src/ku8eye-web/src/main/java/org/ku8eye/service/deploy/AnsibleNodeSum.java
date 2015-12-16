package org.ku8eye.service.deploy;

public class AnsibleNodeSum {
private final int ok;
private final int changed;
private final int unreachable;
private final int failed;

public AnsibleNodeSum(int ok, int changed, int unreachable, int failed) {
	super();
	this.ok = ok;
	this.changed = changed;
	this.unreachable = unreachable;
	this.failed = failed;
}

public int getOk() {
	return ok;
}

public int getChanged() {
	return changed;
}

public int getUnreachable() {
	return unreachable;
}

public int getFailed() {
	return failed;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + changed;
	result = prime * result + failed;
	result = prime * result + ok;
	result = prime * result + unreachable;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	AnsibleNodeSum other = (AnsibleNodeSum) obj;
	if (changed != other.changed)
		return false;
	if (failed != other.failed)
		return false;
	if (ok != other.ok)
		return false;
	if (unreachable != other.unreachable)
		return false;
	return true;
}

public boolean isSuccess()
{
	return failed==0 && unreachable==0 ;
}

}