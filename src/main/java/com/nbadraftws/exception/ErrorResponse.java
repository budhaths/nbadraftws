package com.nbadraftws.exception;

import java.util.Date;

/**
 * The type Error Response
 * @author suraj.budhathoki
 *
 */
public class ErrorResponse {
	
	private Date timestamp;
	private String status;
	private String message;
	private String details;
	
	/**
	 * Instantiates a new Error response.
	 * @param timestamp
	 * @param status
	 * @param message
	 * @param details
	 */
	public ErrorResponse(Date timestamp, String status, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.message = message;
		this.details = details;
	}

	/**
	 * gets timestamp
	 * 
	 * @return the Timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * sets timestamp
	 * 
	 * @param timestamp
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * gets status 
	 * 
	 * @return the  status
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * gets
	 * @param status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	
	/**
	 * gets message
	 * 
	 * @return the message
	 */

	public String getMessage() {
		return message;
	}

	/**
	 * sets the message
	 * 
	 * @param message
	 * 
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Gets the details
	 * 
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * Sets the details
	 * 
	 * @param details
	 */
	public void setDetails(String details) {
		this.details = details;
	}

}
