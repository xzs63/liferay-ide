/*******************************************************************************
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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
 * Contributors:
 *    Gregory Amerson - initial implementation
 ******************************************************************************/

package com.liferay.ide.hook.core.model;

import com.liferay.ide.hook.core.model.internal.SrcFoldersRelativePathService;

import org.eclipse.sapphire.Element;
import org.eclipse.sapphire.ElementType;
import org.eclipse.sapphire.Value;
import org.eclipse.sapphire.ValueProperty;
import org.eclipse.sapphire.modeling.Path;
import org.eclipse.sapphire.modeling.annotations.FileExtensions;
import org.eclipse.sapphire.modeling.annotations.FileSystemResourceType;
import org.eclipse.sapphire.modeling.annotations.InitialValue;
import org.eclipse.sapphire.modeling.annotations.Label;
import org.eclipse.sapphire.modeling.annotations.MustExist;
import org.eclipse.sapphire.modeling.annotations.Service;
import org.eclipse.sapphire.modeling.annotations.Type;
import org.eclipse.sapphire.modeling.annotations.ValidFileSystemResourceType;
import org.eclipse.sapphire.modeling.xml.annotations.XmlBinding;

/**
 * @author Gregory Amerson
 */
public interface PortalPropertiesFile extends Element
{

    ElementType TYPE = new ElementType( PortalPropertiesFile.class );

    // *** Value ***

    @Type( base = Path.class )
    @Label( standard = "Portal Properties File" )
    @XmlBinding( path = "" )
    @InitialValue( text = "portal.properties" )
    @Service( impl = SrcFoldersRelativePathService.class )
    @ValidFileSystemResourceType( FileSystemResourceType.FILE )
    @FileExtensions( expr = "properties" )
    @MustExist
    ValueProperty PROP_VALUE = new ValueProperty( TYPE, "Value" ); //$NON-NLS-1$

    Value<Path> getValue();

    void setValue( String value );

    void setValue( Path value );
}
