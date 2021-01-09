package com.gempukku.libgdx.lib.camera2d.constraint;

import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.math.MathUtils;

public class PixelPerfectCameraConstraint implements CameraConstraint {
    @Override
    public void applyConstraint(Camera camera, float delta) {
        camera.position.x = MathUtils.round(camera.position.x);
        camera.position.y = MathUtils.round(camera.position.y);
        camera.viewportWidth = MathUtils.round(camera.viewportWidth);
        camera.viewportHeight = MathUtils.round(camera.viewportHeight);
        camera.update();
    }
}
