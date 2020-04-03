package com.iloshini.ts;

/**
 * Created By
 *
 * @author Amila
 * @date 4/3/20
 * @project testing-service
 */
public class MyResponse
{
	private String message;
	private long status;

	public MyResponse()
	{
	}

	public MyResponse( String message, long status )
	{
		this.message = message;
		this.status = status;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage( String message )
	{
		this.message = message;
	}

	public long getStatus()
	{
		return status;
	}

	public void setStatus( long status )
	{
		this.status = status;
	}
}
