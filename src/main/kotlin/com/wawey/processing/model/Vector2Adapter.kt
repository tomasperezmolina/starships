package com.wawey.processing.model

import edu.austral.starship.base.vector.Vector2

/**
 *
 * @author Tomas Perez Molina
 */
class Vector2Adapter private constructor(private val vector2: Vector2): Vector2D {

    override val x: Float
        get() = vector2.x
    override val y: Float
        get() = vector2.y

    override fun add(other: Vector2D): Vector2D =
            Vector2Adapter(vector2.add(convert(other)))

    override fun substract(other: Vector2D): Vector2D =
            Vector2Adapter(vector2.substract(convert(other)))

    override fun multiply(scalar: Float): Vector2D =
            Vector2Adapter(vector2.multiply(scalar))

    override fun rotate(angle: Float): Vector2D =
            Vector2Adapter(vector2.rotate(angle))

    override fun module(): Float = vector2.module()

    override fun unitary(): Vector2D = Vector2Adapter(vector2.unitary())

    override fun angle(): Float = vector2.angle()

    private fun convert(v: Vector2D): Vector2 = Vector2.vector(v.x, v.y)

    companion object {
        fun vector(x: Float, y: Float): Vector2D =
                Vector2Adapter(Vector2.vector(x, y))
        fun fromModule(module: Float, angle: Float): Vector2D =
                Vector2Adapter(Vector2.vectorFromModule(module, angle))
    }
}