package com.wawey.processing.view

import com.wawey.processing.model.vector2D.Vector2D
import edu.austral.starship.base.vector.Vector2
import java.awt.Point

/**
 *
 * @author Tomas Perez Molina
 */
interface Plane {
    fun ellipse(radiusA: Int, radiusB: Int, position: Vector2D, angle: Float)
    fun rectangle(width: Int, height: Int, position: Vector2D, angle: Float)
    fun polygon(points: List<Vector2D>, position: Vector2D, angle: Float)
    fun setDrawColors(drawColors: DrawColors)

    //New
    fun getWidth(): Int
    fun getHeight(): Int
}