package com.actelion.research.orbit.imageAnalysis.components.icons;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.icon.ResizableIcon;
import org.pushingpixels.neon.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class document_new_4 implements ResizableIcon {
    

    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
        Shape clip = null;

        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    AffineTransform defaultTransform_ = g.getTransform();
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(0.02165151946246624f, 0.0f, 0.0f, 0.014857430011034012f, 43.007598876953125f, 42.68539047241211f));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
AffineTransform defaultTransform__0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0
shape = new Rectangle2D.Double(-1559.2523193359375, -150.6968536376953, 1339.633544921875, 478.357177734375);
paint = new LinearGradientPaint(new Point2D.Double(302.8571472167969, 366.64788818359375), new Point2D.Double(302.8571472167969, 609.5050659179688), new float[] {0.0f,0.5f,1.0f}, new Color[] {new Color(0, 0, 0, 0),new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1892.178955078125f, -872.8853759765625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
AffineTransform defaultTransform__0_0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-219.61876, -150.68037);
((GeneralPath)shape).curveTo(-219.61876, -150.68037, -219.61876, 327.65042, -219.61876, 327.65042);
((GeneralPath)shape).curveTo(-76.74459, 328.55087, 125.78146, 220.48074, 125.78138, 88.45424);
((GeneralPath)shape).curveTo(125.78138, -43.572304, -33.655437, -150.68036, -219.61876, -150.68037);
((GeneralPath)shape).closePath();
paint = new RadialGradientPaint(new Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, new Point2D.Double(605.7142944335938, 486.64788818359375), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, -1891.633056640625f, -872.8853759765625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.40206185f * origAlpha));
AffineTransform defaultTransform__0_0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-1559.2523, -150.68037);
((GeneralPath)shape).curveTo(-1559.2523, -150.68037, -1559.2523, 327.65042, -1559.2523, 327.65042);
((GeneralPath)shape).curveTo(-1702.1265, 328.55087, -1904.6525, 220.48074, -1904.6525, 88.45424);
((GeneralPath)shape).curveTo(-1904.6525, -43.572304, -1745.2157, -150.68036, -1559.2523, -150.68037);
((GeneralPath)shape).closePath();
paint = new RadialGradientPaint(new Point2D.Double(605.7142944335938, 486.64788818359375), 117.14286f, new Point2D.Double(605.7142944335938, 486.64788818359375), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-2.7743890285491943f, 0.0f, 0.0f, 1.9697060585021973f, 112.76229858398438f, -872.8853759765625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_2);
g.setTransform(defaultTransform__0_0_0);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_0
shape = new RoundRectangle2D.Double(6.60355281829834, 3.6464462280273438, 34.875, 40.920494079589844, 2.2980971336364746, 2.2980971336364746);
paint = new RadialGradientPaint(new Point2D.Double(33.966678619384766, 35.736915588378906), 86.70845f, new Point2D.Double(33.966678619384766, 35.736915588378906), new float[] {0.0f,1.0f}, new Color[] {new Color(250, 250, 250, 255),new Color(187, 187, 187, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9604930281639099f, 0.0f, 0.0f, 1.0411319732666016f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
paint = new RadialGradientPaint(new Point2D.Double(8.824419021606445, 3.7561285495758057), 37.751713f, new Point2D.Double(8.824419021606445, 3.7561285495758057), new float[] {0.0f,1.0f}, new Color[] {new Color(163, 163, 163, 255),new Color(76, 76, 76, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f));
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(6.60355281829834, 3.6464462280273438, 34.875, 40.920494079589844, 2.2980971336364746, 2.2980971336364746);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_1
paint = new RadialGradientPaint(new Point2D.Double(8.143556594848633, 7.26789665222168), 38.158695f, new Point2D.Double(8.143556594848633, 7.26789665222168), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(248, 248, 248, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9682729840278625f, 0.0f, 0.0f, 1.0327670574188232f, 3.353553056716919f, 0.6464470028877258f));
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
shape = new RoundRectangle2D.Double(7.666053771972656, 4.583946228027344, 32.77588653564453, 38.94638442993164, 0.2980971336364746, 0.2980971336364746);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.6464470028877258f, -0.03798932954668999f));
// _0_1_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_2_0 = g.getTransform();
g.transform(new AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.967081069946289f, 4.244972229003906f));
// _0_1_2_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_2_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_0_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.428, 113.07);
((GeneralPath)shape).curveTo(23.428, 115.043, 21.828, 116.642, 19.855, 116.642);
((GeneralPath)shape).curveTo(17.881, 116.642, 16.282, 115.042, 16.282, 113.07);
((GeneralPath)shape).curveTo(16.282, 111.096, 17.882, 109.497, 19.855, 109.497);
((GeneralPath)shape).curveTo(21.828, 109.497, 23.428, 111.097, 23.428, 113.07);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_2_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_2_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(23.428, 63.07);
((GeneralPath)shape).curveTo(23.428, 65.043, 21.828, 66.643, 19.855, 66.643);
((GeneralPath)shape).curveTo(17.881, 66.643, 16.282, 65.043, 16.282, 63.07);
((GeneralPath)shape).curveTo(16.282, 61.096, 17.882, 59.497, 19.855, 59.497);
((GeneralPath)shape).curveTo(21.828, 59.497, 23.428, 61.097, 23.428, 63.07);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_2_0_1);
g.setTransform(defaultTransform__0_1_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.995011, 29.952326);
((GeneralPath)shape).curveTo(9.995011, 30.40553, 9.627486, 30.772825, 9.174282, 30.772825);
((GeneralPath)shape).curveTo(8.720848, 30.772825, 8.353554, 30.4053, 8.353554, 29.952326);
((GeneralPath)shape).curveTo(8.353554, 29.498892, 8.721078, 29.131598, 9.174282, 29.131598);
((GeneralPath)shape).curveTo(9.627486, 29.131598, 9.995011, 29.499123, 9.995011, 29.952326);
((GeneralPath)shape).closePath();
paint = new RadialGradientPaint(new Point2D.Double(20.892099380493164, 114.56839752197266), 5.256f, new Point2D.Double(20.892099380493164, 114.56839752197266), new float[] {0.0f,1.0f}, new Color[] {new Color(240, 240, 240, 255),new Color(154, 154, 154, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.613529205322266f, 3.9798080921173096f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_2_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_2_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_2_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.995011, 18.467176);
((GeneralPath)shape).curveTo(9.995011, 18.92038, 9.627486, 19.287905, 9.174282, 19.287905);
((GeneralPath)shape).curveTo(8.720848, 19.287905, 8.353554, 18.92038, 8.353554, 18.467176);
((GeneralPath)shape).curveTo(8.353554, 18.013742, 8.721078, 17.646446, 9.174282, 17.646446);
((GeneralPath)shape).curveTo(9.627486, 17.646446, 9.995011, 18.013971, 9.995011, 18.467176);
((GeneralPath)shape).closePath();
paint = new RadialGradientPaint(new Point2D.Double(20.892099380493164, 64.56790161132812), 5.257f, new Point2D.Double(20.892099380493164, 64.56790161132812), new float[] {0.0f,1.0f}, new Color[] {new Color(240, 240, 240, 255),new Color(154, 154, 154, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.22970299422740936f, 0.0f, 0.0f, 0.22970299422740936f, 4.613529205322266f, 3.9798080921173096f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_1_2_2);
g.setTransform(defaultTransform__0_1_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_3
paint = new Color(0, 0, 0, 4);
stroke = new BasicStroke(0.9885531f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.505723, 5.4942765);
((GeneralPath)shape).lineTo(11.505723, 43.400867);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1_4
paint = new Color(255, 255, 255, 52);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(12.5, 5.0205154);
((GeneralPath)shape).lineTo(12.5, 43.038227);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1_4);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2_0 = g.getTransform();
g.transform(new AffineTransform(0.7832919955253601f, 0.0f, 0.0f, 0.7832919955253601f, -6.340882778167725f, -86.65167999267578f));
// _0_2_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(69.375, 125.0);
((GeneralPath)shape).curveTo(69.39803, 130.151, 66.66322, 134.92062, 62.206123, 137.50279);
((GeneralPath)shape).curveTo(57.74902, 140.08498, 52.25098, 140.08498, 47.793877, 137.50279);
((GeneralPath)shape).curveTo(43.336773, 134.92062, 40.601963, 130.151, 40.625, 125.0);
((GeneralPath)shape).curveTo(40.601963, 119.84899, 43.336773, 115.07938, 47.793877, 112.4972);
((GeneralPath)shape).curveTo(52.25098, 109.91502, 57.74902, 109.91502, 62.206123, 112.4972);
((GeneralPath)shape).curveTo(66.66322, 115.07938, 69.39803, 119.84899, 69.375, 125.0);
((GeneralPath)shape).closePath();
paint = new RadialGradientPaint(new Point2D.Double(55.0, 125.0), 14.375f, new Point2D.Double(55.0, 125.0), new float[] {0.0f,0.5f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 245, 32, 227),new Color(255, 243, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2_0);
g.setTransform(defaultTransform__0_2);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 1.7689789533615112;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 0.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 46.231021881103516;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 47.566810607910156;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private document_new_4() {
        this.width = (int) getOrigWidth();
        this.height = (int) getOrigHeight();
	}

    @Override
	public int getIconHeight() {
		return height;
	}

    @Override
	public int getIconWidth() {
		return width;
	}

	@Override
	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		g2d.translate(x, y);

        double coef1 = (double) this.width / getOrigWidth();
        double coef2 = (double) this.height / getOrigHeight();
        double coef = Math.min(coef1, coef2);
        g2d.clipRect(0, 0, this.width, this.height);
        g2d.scale(coef, coef);
        g2d.translate(-getOrigX(), -getOrigY());
        if (coef1 != coef2) {
            if (coef1 < coef2) {
               int extraDy = (int) ((getOrigWidth() - getOrigHeight()) / 2.0);
               g2d.translate(0, extraDy);
            } else {
               int extraDx = (int) ((getOrigHeight() - getOrigWidth()) / 2.0);
               g2d.translate(extraDx, 0);
            }
        }
        Graphics2D g2ForInner = (Graphics2D) g2d.create();
        innerPaint(g2ForInner);
        g2ForInner.dispose();
        g2d.dispose();
	}
    
    /**
     * Returns a new instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new instance of this icon with specified dimensions.
     */
    public static ResizableIcon of(int width, int height) {
       document_new_4 base = new document_new_4();
       base.width = width;
       base.height = height;
       return base;
    }

    /**
     * Returns a new {@link UIResource} instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new {@link UIResource} instance of this icon with specified dimensions.
     */
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       document_new_4 base = new document_new_4();
       base.width = width;
       base.height = height;
       return new ResizableIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return document_new_4::new;
    }
}

