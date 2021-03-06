/*
 * EnumAnnotationElement.java
 *
 * Copyright (c) 2013 Mike Strobel
 *
 * This source code is based on Mono.Cecil from Jb Evain, Copyright (c) Jb Evain;
 * and ILSpy/ICSharpCode from SharpDevelop, Copyright (c) AlphaSierraPapa.
 *
 * This source code is subject to terms and conditions of the Apache License, Version 2.0.
 * A copy of the license can be found in the License.html file at the root of this distribution.
 * By using this source code in any fashion, you are agreeing to be bound by the terms of the
 * Apache License, Version 2.0.
 *
 * You must not remove this notice, or any other, from this software.
 */

package com.strobel.assembler.metadata.annotations;

import com.strobel.assembler.metadata.TypeReference;
import com.strobel.core.VerifyArgument;

/**
 * @author Mike Strobel
 */
public final class EnumAnnotationElement extends AnnotationElement {
    private final TypeReference _enumType;
    private final String _enumConstantName;

    public EnumAnnotationElement(final TypeReference enumType, final String enumConstantName) {
        super(AnnotationElementType.Enum);
        _enumType = VerifyArgument.notNull(enumType, "enumType");
        _enumConstantName = VerifyArgument.notNull(enumConstantName, "enumConstantName");
    }

    public TypeReference getEnumType() {
        return _enumType;
    }

    public String getEnumConstantName() {
        return _enumConstantName;
    }
}
