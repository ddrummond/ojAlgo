/*
 * Copyright 1997-2015 Optimatika (www.optimatika.se) Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software
 * without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions: The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software. THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE
 * AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package org.ojalgo.optimisation.convex;

import org.ojalgo.FunctionalityTest;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author apete
 */
public abstract class OptimisationConvexTests extends FunctionalityTest {

    static final boolean DEBUG = false;

    public static Test suite() {
        final TestSuite suite = new TestSuite(OptimisationConvexTests.class.getPackage().getName());
        //$JUnit-BEGIN$
        suite.addTestSuite(ComPictetPamBamTest.class);
        suite.addTestSuite(MostBasicCase.class);
        suite.addTestSuite(Qsd20030327P1Case.class);
        suite.addTestSuite(Qsd20030409P1Case.class);
        suite.addTestSuite(QsdOldFundOfFundsCase.class);
        suite.addTestSuite(QsdOldNormalCase.class);
        suite.addTestSuite(QsdOldOptimalCase.class);
        suite.addTestSuite(ConvexProblems.class);
        //$JUnit-END$
        return suite;
    }

    protected OptimisationConvexTests() {
        super();
    }

    protected OptimisationConvexTests(final String name) {
        super(name);
    }

}
