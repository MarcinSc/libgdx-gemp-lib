package com.gempukku.libgdx.lib.test.sprite;

import com.gempukku.libgdx.graph.pipeline.PipelineRenderer;
import com.gempukku.libgdx.graph.time.TimeProvider;

public interface Sprite {
    void updateSprite(TimeProvider timeProvider, PipelineRenderer pipelineRenderer);
}
