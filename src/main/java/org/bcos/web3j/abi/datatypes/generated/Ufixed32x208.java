package org.bcos.web3j.abi.datatypes.generated;

import java.math.BigInteger;
import org.bcos.web3j.abi.datatypes.Ufixed;

/**
 * <p>Auto generated code.<br>
 * <strong>Do not modifiy!</strong><br>
 * Please use {@link org.bcos.web3j.codegen.AbiTypesGenerator} to update.</p>
 */
public class Ufixed32x208 extends Ufixed {
    public static final Ufixed32x208 DEFAULT = new Ufixed32x208(BigInteger.ZERO);

    public Ufixed32x208(BigInteger value) {
        super(32, 208, value);
    }

    public Ufixed32x208(int mBitSize, int nBitSize, BigInteger m, BigInteger n) {
        super(32, 208, m, n);
    }
}
