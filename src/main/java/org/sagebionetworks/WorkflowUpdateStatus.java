package org.sagebionetworks;

public enum WorkflowUpdateStatus {
	IN_PROGRESS,
	DONE,
	REJECTED,
	ERROR_ENCOUNTERED_DURING_EXECUTION,
	DOCKER_PULL_FAILED,
	STOPPED_UPON_REQUEST,
	STOPPED_TIME_OUT,
	INFRASTRUCTURE_ERROR
}