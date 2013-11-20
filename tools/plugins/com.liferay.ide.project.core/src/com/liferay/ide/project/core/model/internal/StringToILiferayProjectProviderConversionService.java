/*******************************************************************************
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 *******************************************************************************/
package com.liferay.ide.project.core.model.internal;

import com.liferay.ide.core.ILiferayProjectProvider;
import com.liferay.ide.core.LiferayCore;

import org.eclipse.sapphire.ConversionException;
import org.eclipse.sapphire.ConversionService;


/**
 * @author Gregory Amerson
 */
public class StringToILiferayProjectProviderConversionService extends ConversionService<String, ILiferayProjectProvider>
{

    public StringToILiferayProjectProviderConversionService()
    {
        super( String.class, ILiferayProjectProvider.class );
    }

    @Override
    public ILiferayProjectProvider convert( String object ) throws ConversionException
    {
        return LiferayCore.getProvider( object );
    }
}