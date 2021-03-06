/*
 * 
 * Copyright 2001-2004 The Ant-Contrib project
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.github.maven_nar.cpptasks.compiler;
import java.io.File;


import org.apache.tools.ant.types.Environment;

import com.github.maven_nar.cpptasks.parser.CParser;
import com.github.maven_nar.cpptasks.parser.Parser;
/**
 * A command line C compiler that can utilize precompilation of header files
 * 
 * @author Curt Arnold
 */
public abstract class PrecompilingCommandLineCCompiler
        extends
            PrecompilingCommandLineCompiler {
    protected PrecompilingCommandLineCCompiler(String command,
            String identifierArg, String[] sourceExtensions,
            String[] headerExtensions, String outputSuffix, boolean libtool,
            PrecompilingCommandLineCCompiler libtoolCompiler,
            boolean newEnvironment, Environment env) {
        super(command, identifierArg, sourceExtensions, headerExtensions,
                outputSuffix, libtool, libtoolCompiler, newEnvironment, env);
    }
    protected Parser createParser(File source) {
        return new CParser();
    }
}
