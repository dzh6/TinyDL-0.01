package io.leavesfly.tinydl.nnet.layer.activate;

import io.leavesfly.tinydl.func.Variable;
import io.leavesfly.tinydl.func.math.ReLu;
import io.leavesfly.tinydl.ndarr.NdArray;
import io.leavesfly.tinydl.ndarr.Shape;
import io.leavesfly.tinydl.nnet.Layer;

import java.util.List;

/**
 * ReLU激活函数
 */
public class ReLuLayer extends Layer {

    public ReLuLayer(String _name, Shape _xInputShape) {
        super(_name, _xInputShape, _xInputShape);
    }

    public ReLuLayer(String _name) {
        super(_name, null, null);

    }


    @Override
    public void init() {
    }

    @Override
    public Variable forward(Variable... inputs) {
        return new ReLu().call(inputs[0]);
    }

    @Override
    public NdArray forward(NdArray... inputs) {
        return null;
    }

    @Override
    public List<NdArray> backward(NdArray yGrad) {
        return null;
    }

    @Override
    public int requireInputNum() {
        return 0;
    }


}
