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
public class slidepreview1 implements ResizableIcon {
    

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
g.transform(new AffineTransform(1.0666667222976685f, 0.0f, 0.0f, 1.0666667222976685f, -0.0f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, -308.2699890136719f));
// _0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0 = g.getTransform();
g.transform(new AffineTransform(0.0f, 5.690700054168701f, -5.093100070953369f, 0.0f, 1039.4000244140625f, 316.82000732421875f));
// _0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 104.2699966430664f, -312.0799865722656f));
// _0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(0.7385900020599365f, 0.0f, 0.0f, 1.0f, -100.56999969482422f, 311.8800048828125f));
// _0_0_0_0_0
g.setComposite(AlphaComposite.getInstance(3, 0.5f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(11.862, 10.266);
((GeneralPath)shape).lineTo(11.89325, 102.297);
((GeneralPath)shape).lineTo(11.862, 194.297);
((GeneralPath)shape).lineTo(111.862, 194.297);
((GeneralPath)shape).lineTo(111.862, 117.766);
((GeneralPath)shape).lineTo(111.862, 86.766);
((GeneralPath)shape).lineTo(111.862, 10.265999);
((GeneralPath)shape).lineTo(11.8619995, 10.265999);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(13.556, 11.36);
((GeneralPath)shape).lineTo(13.556, 49.627);
((GeneralPath)shape).lineTo(13.556, 154.22699);
((GeneralPath)shape).lineTo(13.556, 192.49399);
((GeneralPath)shape).lineTo(109.556, 192.49399);
((GeneralPath)shape).lineTo(109.556, 109.82199);
((GeneralPath)shape).lineTo(109.556, 94.03699);
((GeneralPath)shape).lineTo(109.556, 11.36499);
((GeneralPath)shape).lineTo(13.556, 11.36499);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(15.5, 98.56400299072266), new Point2D.Double(112.5, 98.56400299072266), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -2.4435999393463135f, 3.359999895095825f));
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(13.556, 11.36);
((GeneralPath)shape).lineTo(13.556, 49.627);
((GeneralPath)shape).lineTo(13.556, 154.22699);
((GeneralPath)shape).lineTo(13.556, 192.49399);
((GeneralPath)shape).lineTo(109.556, 192.49399);
((GeneralPath)shape).lineTo(109.556, 109.82199);
((GeneralPath)shape).lineTo(109.556, 94.03699);
((GeneralPath)shape).lineTo(109.556, 11.36499);
((GeneralPath)shape).lineTo(13.556, 11.36499);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.703, 10.452);
((GeneralPath)shape).lineTo(15.703, 49.077);
((GeneralPath)shape).lineTo(15.703, 154.657);
((GeneralPath)shape).lineTo(15.703, 193.282);
((GeneralPath)shape).lineTo(112.602005, 193.282);
((GeneralPath)shape).lineTo(112.602005, 109.836);
((GeneralPath)shape).lineTo(112.602005, 93.903);
((GeneralPath)shape).lineTo(112.602005, 10.457001);
((GeneralPath)shape).lineTo(15.703003, 10.457001);
((GeneralPath)shape).closePath();
paint = new RadialGradientPaint(new Point2D.Double(103.0999984741211, 56.262001037597656), 48.9f, new Point2D.Double(103.0999984741211, 56.262001037597656), new float[] {0.0f,1.0f}, new Color[] {new Color(210, 242, 255, 255),new Color(243, 243, 243, 201)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-1.2288999557495117f, 2.1689000129699707f, -1.6426000595092773f, -0.9307000041007996f, 323.0400085449219f, -153.86000061035156f));
g.setPaint(paint);
g.fill(shape);
paint = new RadialGradientPaint(new Point2D.Double(18.18199920654297, 147.3699951171875), 48.5f, new Point2D.Double(18.18199920654297, 147.3699951171875), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.8930000066757202f, -0.012714000418782234f, 0.012729000300168991f, 1.8952000141143799f, -18.08099937438965f, -89.3280029296875f));
stroke = new BasicStroke(1.8169f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(15.703, 10.452);
((GeneralPath)shape).lineTo(15.703, 49.077);
((GeneralPath)shape).lineTo(15.703, 154.657);
((GeneralPath)shape).lineTo(15.703, 193.282);
((GeneralPath)shape).lineTo(112.602005, 193.282);
((GeneralPath)shape).lineTo(112.602005, 109.836);
((GeneralPath)shape).lineTo(112.602005, 93.903);
((GeneralPath)shape).lineTo(112.602005, 10.457001);
((GeneralPath)shape).lineTo(15.703003, 10.457001);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_3
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_3_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_3_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(47.032, 42.984);
((GeneralPath)shape).curveTo(46.911472, 42.990303, 46.804993, 43.01315, 46.68825, 43.0465);
((GeneralPath)shape).curveTo(46.100033, 43.21456, 43.872753, 44.4056, 43.56325, 44.9215);
((GeneralPath)shape).curveTo(43.072742, 45.73902, 44.14468, 50.572002, 44.407, 51.359);
((GeneralPath)shape).curveTo(44.734, 52.339993, 46.0047, 55.4449, 45.4382, 56.5778);
((GeneralPath)shape).curveTo(45.17393, 57.106342, 40.5993, 56.53452, 39.8132, 56.79655);
((GeneralPath)shape).curveTo(39.56666, 56.87873, 39.42224, 57.30453, 39.1882, 57.42155);
((GeneralPath)shape).curveTo(36.475403, 58.77795, 36.06, 60.65625, 38.157, 63.01535);
((GeneralPath)shape).curveTo(38.92805, 63.882782, 39.5336, 64.36895, 40.4382, 65.10915);
((GeneralPath)shape).curveTo(41.23719, 65.76287, 42.070503, 66.42635, 42.9382, 66.98415);
((GeneralPath)shape).curveTo(42.9466, 66.989555, 43.064632, 67.075676, 43.15695, 67.1404);
((GeneralPath)shape).curveTo(42.289303, 67.69818, 41.45595, 68.3617, 40.65695, 69.0154);
((GeneralPath)shape).curveTo(39.752293, 69.755585, 39.14675, 70.24171, 38.37575, 71.10921);
((GeneralPath)shape).curveTo(36.27885, 73.46821, 36.694252, 75.3466, 39.40695, 76.70301);
((GeneralPath)shape).curveTo(39.64099, 76.82003, 39.78541, 77.245834, 40.03195, 77.32801);
((GeneralPath)shape).curveTo(40.81805, 77.59004, 45.39265, 77.01822, 45.65695, 77.54676);
((GeneralPath)shape).curveTo(46.223362, 78.67956, 44.95269, 81.78456, 44.62575, 82.765564);
((GeneralPath)shape).curveTo(44.36343, 83.55252, 43.29145, 88.38557, 43.782, 89.203064);
((GeneralPath)shape).curveTo(44.09154, 89.71896, 46.3188, 90.909966, 46.907, 91.078064);
((GeneralPath)shape).curveTo(47.023743, 91.11141, 47.130222, 91.13426, 47.25075, 91.140564);
((GeneralPath)shape).curveTo(47.61235, 91.159325, 48.01152, 91.078064, 48.37575, 91.078064);
((GeneralPath)shape).curveTo(48.92625, 91.078064, 49.68745, 91.211075, 50.21955, 91.078064);
((GeneralPath)shape).curveTo(53.54225, 90.24738, 58.22095, 85.769966, 60.21955, 83.17187);
((GeneralPath)shape).curveTo(60.93426, 82.242744, 63.45195, 78.60547, 62.71955, 77.14067);
((GeneralPath)shape).curveTo(62.50651, 76.714584, 62.35495, 77.09552, 62.09455, 76.92192);
((GeneralPath)shape).curveTo(61.931282, 76.81307, 61.85157, 76.62452, 61.6883, 76.51567);
((GeneralPath)shape).curveTo(61.19084, 76.18403, 60.6258, 76.70851, 60.6258, 75.89067);
((GeneralPath)shape).curveTo(60.6258, 75.75192, 60.52769, 75.55128, 60.6258, 75.45317);
((GeneralPath)shape).curveTo(60.63691, 75.44206, 63.133102, 75.19518, 63.3446, 75.26567);
((GeneralPath)shape).curveTo(63.53076, 75.32772, 63.57534, 75.58416, 63.75085, 75.67192);
((GeneralPath)shape).curveTo(63.90943, 75.75121, 64.14, 75.59823, 64.188354, 75.45317);
((GeneralPath)shape).curveTo(64.412254, 74.78148, 64.301636, 71.902374, 64.188354, 71.10937);
((GeneralPath)shape).curveTo(64.09435, 70.45137, 63.775833, 69.65307, 63.563354, 69.015564);
((GeneralPath)shape).curveTo(63.376583, 68.455246, 63.440384, 67.65756, 63.500854, 66.92176);
((GeneralPath)shape).lineTo(63.250854, 66.92176);
((GeneralPath)shape).curveTo(63.200726, 66.2688, 63.181244, 65.59936, 63.344604, 65.10926);
((GeneralPath)shape).curveTo(63.557083, 64.47182, 63.875603, 63.673462, 63.969604, 63.01546);
((GeneralPath)shape).curveTo(64.082886, 62.22248, 64.193504, 59.34336, 63.969604, 58.67166);
((GeneralPath)shape).curveTo(63.921253, 58.5266, 63.690685, 58.373623, 63.532104, 58.45291);
((GeneralPath)shape).curveTo(63.356594, 58.540672, 63.312016, 58.79711, 63.125854, 58.85916);
((GeneralPath)shape).curveTo(62.914383, 58.929653, 60.418255, 58.68277, 60.407055, 58.67166);
((GeneralPath)shape).curveTo(60.308945, 58.57355, 60.407055, 58.37291, 60.407055, 58.23416);
((GeneralPath)shape).curveTo(60.407055, 57.41632, 60.972095, 57.9408, 61.469555, 57.60916);
((GeneralPath)shape).curveTo(61.632824, 57.500313, 61.712536, 57.31176, 61.875805, 57.20291);
((GeneralPath)shape).curveTo(62.136204, 57.029312, 62.287766, 57.41025, 62.500805, 56.98416);
((GeneralPath)shape).curveTo(63.233246, 55.51926, 60.715504, 51.88206, 60.000805, 50.95296);
((GeneralPath)shape).curveTo(58.002205, 48.35476, 53.323505, 43.87736, 50.000805, 43.04676);
((GeneralPath)shape).curveTo(49.468784, 42.91375, 48.707504, 43.04676, 48.157005, 43.04676);
((GeneralPath)shape).curveTo(47.792774, 43.04676, 47.393604, 42.9655, 47.032005, 42.98426);
((GeneralPath)shape).closePath();
paint = new Color(137, 93, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_0_3_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_3_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_3_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(47.191, 48.61);
((GeneralPath)shape).curveTo(50.827503, 55.3453, 42.249302, 59.389, 41.9462, 63.784);
((GeneralPath)shape).curveTo(46.8872, 66.9692, 44.948803, 71.0035, 40.3067, 72.1003);
((GeneralPath)shape).curveTo(41.157143, 78.598206, 51.5997, 71.89862, 48.0064, 80.6586);
((GeneralPath)shape).curveTo(42.209103, 90.7296, 56.789402, 87.1692, 60.115402, 82.2457);
((GeneralPath)shape).curveTo(64.4092, 78.31239, 58.118202, 75.499695, 63.699, 74.13789);
((GeneralPath)shape).curveTo(61.9266, 66.74249, 62.093903, 59.404892, 57.6542, 52.442894);
((GeneralPath)shape).curveTo(55.631702, 48.134495, 51.0247, 47.654293, 47.366203, 46.784294);
paint = new Color(170, 102, 183, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_0_3_1);
g.setTransform(defaultTransform__0_0_0_0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_4
shape = new Rectangle2D.Double(18.937999725341797, 136.86000061035156, 88.88600158691406, 51.0099983215332);
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
paint = new LinearGradientPaint(new Point2D.Double(57.01900100708008, 132.42999267578125), new Point2D.Double(55.387001037597656, 189.85000610351562), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.2f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(18.937999725341797, 136.86000061035156, 88.88600158691406, 51.0099983215332);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.2417999505996704f, 0.0f, 0.0f, 1.0f, -5.451399803161621f, 0.0f));
// _0_0_0_0_0_5
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 0.3838199973106384f, 221.75999450683594f, 165.1999969482422f));
// _0_0_0_0_0_5_0_0
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_0_0
shape = new Rectangle2D.Double(-186.74000549316406, 11.897000312805176, 0.9807800054550171, 37.02399826049805);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.13557f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-186.74000549316406, 11.897000312805176, 0.9807800054550171, 37.02399826049805);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_0_1
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_0_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_0_1_0
shape = new Rectangle2D.Double(-189.52999877929688, 11.928999900817871, 2.138200044631958, 36.959999084472656);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.2f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-189.52999877929688, 11.928999900817871, 2.138200044631958, 36.959999084472656);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_0_1_0);
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_0_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_0_1_1
shape = new Rectangle2D.Double(-196.3300018310547, 11.928999900817871, 2.138200044631958, 36.959999084472656);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.2f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-196.3300018310547, 11.928999900817871, 2.138200044631958, 36.959999084472656);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_0_1_1);
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_0_1_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_0_1_2
shape = new Rectangle2D.Double(-199.14999389648438, 11.928999900817871, 2.138200044631958, 36.959999084472656);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.2f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-199.14999389648438, 11.928999900817871, 2.138200044631958, 36.959999084472656);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_0_1_2);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_0_2
shape = new Rectangle2D.Double(-178.72000122070312, 11.897000312805176, 0.9807800054550171, 37.02399826049805);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.13557f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-178.72000122070312, 11.897000312805176, 0.9807800054550171, 37.02399826049805);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_0_2);
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_0_3
shape = new Rectangle2D.Double(-172.99000549316406, 11.897000312805176, 0.9807800054550171, 37.02399826049805);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.13557f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-172.99000549316406, 11.897000312805176, 0.9807800054550171, 37.02399826049805);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_0_4
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_0_4_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_0_4_0
shape = new Rectangle2D.Double(-175.7899932861328, 11.928999900817871, 2.138200044631958, 36.959999084472656);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.2f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-175.7899932861328, 11.928999900817871, 2.138200044631958, 36.959999084472656);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_0_4_0);
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_0_4_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_0_4_1
shape = new Rectangle2D.Double(-182.5800018310547, 11.928999900817871, 2.138200044631958, 36.959999084472656);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.2f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-182.5800018310547, 11.928999900817871, 2.138200044631958, 36.959999084472656);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_0_4_1);
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_0_4_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_0_4_2
shape = new Rectangle2D.Double(-185.41000366210938, 11.928999900817871, 2.138200044631958, 36.959999084472656);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.2f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-185.41000366210938, 11.928999900817871, 2.138200044631958, 36.959999084472656);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_0_4_2);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_0_4);
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_0_5
shape = new Rectangle2D.Double(-164.97999572753906, 11.897000312805176, 0.9807800054550171, 37.02399826049805);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.13557f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-164.97999572753906, 11.897000312805176, 0.9807800054550171, 37.02399826049805);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_0_5);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_1 = g.getTransform();
g.transform(new AffineTransform(-1.0f, 0.0f, 0.0f, 0.3838199973106384f, -112.37000274658203f, 165.1999969482422f));
// _0_0_0_0_0_5_0_1
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_1_0
shape = new Rectangle2D.Double(-186.74000549316406, 11.897000312805176, 0.9807800054550171, 37.02399826049805);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.13557f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-186.74000549316406, 11.897000312805176, 0.9807800054550171, 37.02399826049805);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_1_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_1_1
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_1_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_1_1_0
shape = new Rectangle2D.Double(-189.52999877929688, 11.928999900817871, 2.138200044631958, 36.959999084472656);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.2f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-189.52999877929688, 11.928999900817871, 2.138200044631958, 36.959999084472656);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_1_1_0);
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_1_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_1_1_1
shape = new Rectangle2D.Double(-196.3300018310547, 11.928999900817871, 2.138200044631958, 36.959999084472656);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.2f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-196.3300018310547, 11.928999900817871, 2.138200044631958, 36.959999084472656);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_1_1_1);
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_1_1_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_1_1_2
shape = new Rectangle2D.Double(-199.14999389648438, 11.928999900817871, 2.138200044631958, 36.959999084472656);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.2f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-199.14999389648438, 11.928999900817871, 2.138200044631958, 36.959999084472656);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_1_1_2);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_1_1);
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_1_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_1_2
shape = new Rectangle2D.Double(-178.72000122070312, 11.897000312805176, 0.9807800054550171, 37.02399826049805);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.13557f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-178.72000122070312, 11.897000312805176, 0.9807800054550171, 37.02399826049805);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_1_2);
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_1_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_1_3
shape = new Rectangle2D.Double(-172.99000549316406, 11.897000312805176, 0.9807800054550171, 37.02399826049805);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.13557f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-172.99000549316406, 11.897000312805176, 0.9807800054550171, 37.02399826049805);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_1_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_1_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_1_4
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_1_4_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_1_4_0
shape = new Rectangle2D.Double(-175.7899932861328, 11.928999900817871, 2.138200044631958, 36.959999084472656);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.2f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-175.7899932861328, 11.928999900817871, 2.138200044631958, 36.959999084472656);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_1_4_0);
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_1_4_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_1_4_1
shape = new Rectangle2D.Double(-182.5800018310547, 11.928999900817871, 2.138200044631958, 36.959999084472656);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.2f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-182.5800018310547, 11.928999900817871, 2.138200044631958, 36.959999084472656);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_1_4_1);
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_1_4_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_1_4_2
shape = new Rectangle2D.Double(-185.41000366210938, 11.928999900817871, 2.138200044631958, 36.959999084472656);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.2f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-185.41000366210938, 11.928999900817871, 2.138200044631958, 36.959999084472656);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_1_4_2);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_1_4);
g.setComposite(AlphaComposite.getInstance(3, 0.78761f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_5_0_1_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_5_0_1_5
shape = new Rectangle2D.Double(-164.97999572753906, 11.897000312805176, 0.9807800054550171, 37.02399826049805);
paint = new Color(0, 0, 0, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(0.13557f,1,1,4.0f,null,0.0f);
shape = new Rectangle2D.Double(-164.97999572753906, 11.897000312805176, 0.9807800054550171, 37.02399826049805);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_1_5);
g.setTransform(defaultTransform__0_0_0_0_0_5_0_1);
g.setTransform(defaultTransform__0_0_0_0_0_5_0);
g.setTransform(defaultTransform__0_0_0_0_0_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_6 = g.getTransform();
g.transform(new AffineTransform(0.9343100190162659f, 0.0f, 0.0f, 1.0702999830245972f, 0.0f, 0.0f));
{
    Graphics2D gText = ((Graphics2D)g.create());
            Shape shapeText = null;
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
paint = new Color(0, 0, 0, 255);
gText.setPaint(paint);
shapeText = new GeneralPath();
((GeneralPath)shapeText).moveTo(24.16161, 146.07475);
((GeneralPath)shapeText).lineTo(24.16161, 136.71182);
((GeneralPath)shapeText).lineTo(30.931532, 136.71182);
((GeneralPath)shapeText).lineTo(30.931532, 137.81459);
((GeneralPath)shapeText).lineTo(25.400633, 137.81459);
((GeneralPath)shapeText).lineTo(25.400633, 140.68436);
((GeneralPath)shapeText).lineTo(30.58239, 140.68436);
((GeneralPath)shapeText).lineTo(30.58239, 141.78288);
((GeneralPath)shapeText).lineTo(25.400633, 141.78288);
((GeneralPath)shapeText).lineTo(25.400633, 144.96773);
((GeneralPath)shapeText).lineTo(31.14868, 144.96773);
((GeneralPath)shapeText).lineTo(31.14868, 146.07475);
((GeneralPath)shapeText).lineTo(24.16161, 146.07475);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(32.809227, 146.07475);
((GeneralPath)shapeText).lineTo(32.809227, 136.71182);
((GeneralPath)shapeText).lineTo(34.048252, 136.71182);
((GeneralPath)shapeText).lineTo(34.048252, 144.96773);
((GeneralPath)shapeText).lineTo(38.659462, 144.96773);
((GeneralPath)shapeText).lineTo(38.659462, 146.07475);
((GeneralPath)shapeText).lineTo(32.809227, 146.07475);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(40.0837, 146.07475);
((GeneralPath)shapeText).lineTo(40.0837, 136.71182);
((GeneralPath)shapeText).lineTo(43.596394, 136.71182);
((GeneralPath)shapeText).quadTo(44.66936, 136.71182, 45.31655, 136.9971);
((GeneralPath)shapeText).quadTo(45.967995, 137.2781, 46.334167, 137.86995);
((GeneralPath)shapeText).quadTo(46.70034, 138.46178, 46.70034, 139.10472);
((GeneralPath)shapeText).quadTo(46.70034, 139.70506, 46.372486, 140.23729);
((GeneralPath)shapeText).quadTo(46.048893, 140.76526, 45.393192, 141.09311);
((GeneralPath)shapeText).quadTo(46.240494, 141.34007, 46.69608, 141.94041);
((GeneralPath)shapeText).quadTo(47.155926, 142.54077, 47.155926, 143.35826);
((GeneralPath)shapeText).quadTo(47.155926, 144.01823, 46.87491, 144.58452);
((GeneralPath)shapeText).quadTo(46.598152, 145.14655, 46.1894, 145.45311);
((GeneralPath)shapeText).quadTo(45.78065, 145.75967, 45.16327, 145.91722);
((GeneralPath)shapeText).quadTo(44.550144, 146.07475, 43.656002, 146.07475);
((GeneralPath)shapeText).lineTo(40.0837, 146.07475);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(41.322723, 140.64604);
((GeneralPath)shapeText).lineTo(43.34944, 140.64604);
((GeneralPath)shapeText).quadTo(44.1712, 140.64604, 44.528854, 140.53534);
((GeneralPath)shapeText).quadTo(45.001472, 140.39484, 45.23991, 140.07124);
((GeneralPath)shapeText).quadTo(45.482605, 139.7434, 45.482605, 139.25374);
((GeneralPath)shapeText).quadTo(45.482605, 138.78539, 45.25694, 138.43198);
((GeneralPath)shapeText).quadTo(45.035534, 138.07858, 44.618267, 137.9466);
((GeneralPath)shapeText).quadTo(44.20526, 137.81459, 43.19616, 137.81459);
((GeneralPath)shapeText).lineTo(41.322723, 137.81459);
((GeneralPath)shapeText).lineTo(41.322723, 140.64604);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(41.322723, 144.96773);
((GeneralPath)shapeText).lineTo(43.656002, 144.96773);
((GeneralPath)shapeText).quadTo(44.256355, 144.96773, 44.49905, 144.92514);
((GeneralPath)shapeText).quadTo(44.92483, 144.8485, 45.210106, 144.66968);
((GeneralPath)shapeText).quadTo(45.499638, 144.49084, 45.68272, 144.15022);
((GeneralPath)shapeText).quadTo(45.870064, 143.80534, 45.870064, 143.35826);
((GeneralPath)shapeText).quadTo(45.870064, 142.83456, 45.60182, 142.45135);
((GeneralPath)shapeText).quadTo(45.33358, 142.06389, 44.856705, 141.90636);
((GeneralPath)shapeText).quadTo(44.38409, 141.74881, 43.48995, 141.74881);
((GeneralPath)shapeText).lineTo(41.322723, 141.74881);
((GeneralPath)shapeText).lineTo(41.322723, 144.96773);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(48.394947, 141.45503);
((GeneralPath)shapeText).quadTo(48.394947, 139.79448, 48.735573, 138.78539);
((GeneralPath)shapeText).quadTo(49.0762, 137.77202, 49.74893, 137.22276);
((GeneralPath)shapeText).quadTo(50.425926, 136.67351, 51.4478, 136.67351);
((GeneralPath)shapeText).quadTo(52.201435, 136.67351, 52.767723, 136.97581);
((GeneralPath)shapeText).quadTo(53.33827, 137.2781, 53.7087, 137.85292);
((GeneralPath)shapeText).quadTo(54.07913, 138.42346, 54.28776, 139.24522);
((GeneralPath)shapeText).quadTo(54.500652, 140.06273, 54.500652, 141.45503);
((GeneralPath)shapeText).quadTo(54.500652, 143.1028, 54.160027, 144.11617);
((GeneralPath)shapeText).quadTo(53.823658, 145.12952, 53.146667, 145.68303);
((GeneralPath)shapeText).quadTo(52.473934, 146.23656, 51.4478, 146.23656);
((GeneralPath)shapeText).quadTo(50.093815, 146.23656, 49.318893, 145.2615);
((GeneralPath)shapeText).quadTo(48.394947, 144.09486, 48.394947, 141.45503);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(49.574364, 141.45503);
((GeneralPath)shapeText).quadTo(49.574364, 143.76276, 50.115105, 144.5249);
((GeneralPath)shapeText).quadTo(50.655846, 145.28706, 51.4478, 145.28706);
((GeneralPath)shapeText).quadTo(52.239754, 145.28706, 52.776237, 144.52065);
((GeneralPath)shapeText).quadTo(53.31698, 143.75424, 53.31698, 141.45503);
((GeneralPath)shapeText).quadTo(53.31698, 139.14304, 52.776237, 138.38515);
((GeneralPath)shapeText).quadTo(52.239754, 137.623, 51.435028, 137.623);
((GeneralPath)shapeText).quadTo(50.643074, 137.623, 50.170456, 138.29573);
((GeneralPath)shapeText).quadTo(49.574364, 139.15155, 49.574364, 141.45503);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(55.66942, 141.45503);
((GeneralPath)shapeText).quadTo(55.66942, 139.79448, 56.010044, 138.78539);
((GeneralPath)shapeText).quadTo(56.35067, 137.77202, 57.023403, 137.22276);
((GeneralPath)shapeText).quadTo(57.700397, 136.67351, 58.72227, 136.67351);
((GeneralPath)shapeText).quadTo(59.475906, 136.67351, 60.042194, 136.97581);
((GeneralPath)shapeText).quadTo(60.61274, 137.2781, 60.98317, 137.85292);
((GeneralPath)shapeText).quadTo(61.3536, 138.42346, 61.562233, 139.24522);
((GeneralPath)shapeText).quadTo(61.775124, 140.06273, 61.775124, 141.45503);
((GeneralPath)shapeText).quadTo(61.775124, 143.1028, 61.434498, 144.11617);
((GeneralPath)shapeText).quadTo(61.09813, 145.12952, 60.42114, 145.68303);
((GeneralPath)shapeText).quadTo(59.748405, 146.23656, 58.72227, 146.23656);
((GeneralPath)shapeText).quadTo(57.368286, 146.23656, 56.593365, 145.2615);
((GeneralPath)shapeText).quadTo(55.66942, 144.09486, 55.66942, 141.45503);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(56.848835, 141.45503);
((GeneralPath)shapeText).quadTo(56.848835, 143.76276, 57.389576, 144.5249);
((GeneralPath)shapeText).quadTo(57.930317, 145.28706, 58.72227, 145.28706);
((GeneralPath)shapeText).quadTo(59.514225, 145.28706, 60.05071, 144.52065);
((GeneralPath)shapeText).quadTo(60.59145, 143.75424, 60.59145, 141.45503);
((GeneralPath)shapeText).quadTo(60.59145, 139.14304, 60.05071, 138.38515);
((GeneralPath)shapeText).quadTo(59.514225, 137.623, 58.7095, 137.623);
((GeneralPath)shapeText).quadTo(57.917545, 137.623, 57.444927, 138.29573);
((GeneralPath)shapeText).quadTo(56.848835, 139.15155, 56.848835, 141.45503);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(63.11421, 143.90753);
((GeneralPath)shapeText).lineTo(64.22124, 143.80534);
((GeneralPath)shapeText).quadTo(64.36175, 144.58452, 64.75772, 144.93791);
((GeneralPath)shapeText).quadTo(65.1537, 145.28706, 65.77108, 145.28706);
((GeneralPath)shapeText).quadTo(66.30331, 145.28706, 66.69929, 145.04436);
((GeneralPath)shapeText).quadTo(67.09952, 144.80167, 67.35499, 144.39717);
((GeneralPath)shapeText).quadTo(67.61046, 143.99268, 67.78077, 143.30292);
((GeneralPath)shapeText).quadTo(67.95534, 142.61314, 67.95534, 141.89784);
((GeneralPath)shapeText).quadTo(67.95534, 141.8212, 67.95108, 141.66792);
((GeneralPath)shapeText).quadTo(67.6062, 142.21718, 67.00585, 142.5578);
((GeneralPath)shapeText).quadTo(66.40975, 142.89842, 65.71573, 142.89842);
((GeneralPath)shapeText).quadTo(64.553345, 142.89842, 63.748623, 142.05537);
((GeneralPath)shapeText).quadTo(62.943893, 141.21233, 62.943893, 139.8328);
((GeneralPath)shapeText).quadTo(62.943893, 138.41069, 63.782684, 137.5421);
((GeneralPath)shapeText).quadTo(64.621475, 136.67351, 65.88605, 136.67351);
((GeneralPath)shapeText).quadTo(66.801476, 136.67351, 67.55511, 137.1674);
((GeneralPath)shapeText).quadTo(68.312996, 137.65706, 68.70471, 138.56822);
((GeneralPath)shapeText).quadTo(69.10069, 139.47514, 69.10069, 141.19955);
((GeneralPath)shapeText).quadTo(69.10069, 142.99635, 68.70898, 144.0608);
((GeneralPath)shapeText).quadTo(68.32151, 145.121, 67.55085, 145.67877);
((GeneralPath)shapeText).quadTo(66.78018, 146.23656, 65.74554, 146.23656);
((GeneralPath)shapeText).quadTo(64.64702, 146.23656, 63.94874, 145.62769);
((GeneralPath)shapeText).quadTo(63.254715, 145.01456, 63.11421, 143.90753);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(67.82335, 139.77745);
((GeneralPath)shapeText).quadTo(67.82335, 138.78539, 67.29538, 138.20631);
((GeneralPath)shapeText).quadTo(66.76741, 137.623, 66.02655, 137.623);
((GeneralPath)shapeText).quadTo(65.26015, 137.623, 64.6896, 138.24889);
((GeneralPath)shapeText).quadTo(64.12331, 138.87479, 64.12331, 139.87112);
((GeneralPath)shapeText).quadTo(64.12331, 140.76526, 64.664055, 141.32729);
((GeneralPath)shapeText).quadTo(65.204796, 141.88507, 65.99675, 141.88507);
((GeneralPath)shapeText).quadTo(66.79296, 141.88507, 67.30815, 141.32729);
((GeneralPath)shapeText).quadTo(67.82335, 140.76526, 67.82335, 139.77745);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(70.21837, 141.45503);
((GeneralPath)shapeText).quadTo(70.21837, 139.79448, 70.559, 138.78539);
((GeneralPath)shapeText).quadTo(70.89962, 137.77202, 71.57236, 137.22276);
((GeneralPath)shapeText).quadTo(72.249344, 136.67351, 73.271225, 136.67351);
((GeneralPath)shapeText).quadTo(74.02486, 136.67351, 74.59114, 136.97581);
((GeneralPath)shapeText).quadTo(75.16169, 137.2781, 75.53212, 137.85292);
((GeneralPath)shapeText).quadTo(75.90255, 138.42346, 76.11118, 139.24522);
((GeneralPath)shapeText).quadTo(76.32407, 140.06273, 76.32407, 141.45503);
((GeneralPath)shapeText).quadTo(76.32407, 143.1028, 75.98345, 144.11617);
((GeneralPath)shapeText).quadTo(75.64708, 145.12952, 74.97009, 145.68303);
((GeneralPath)shapeText).quadTo(74.297356, 146.23656, 73.271225, 146.23656);
((GeneralPath)shapeText).quadTo(71.91724, 146.23656, 71.14232, 145.2615);
((GeneralPath)shapeText).quadTo(70.21837, 144.09486, 70.21837, 141.45503);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(71.39778, 141.45503);
((GeneralPath)shapeText).quadTo(71.39778, 143.76276, 71.93853, 144.5249);
((GeneralPath)shapeText).quadTo(72.47927, 145.28706, 73.271225, 145.28706);
((GeneralPath)shapeText).quadTo(74.06317, 145.28706, 74.59966, 144.52065);
((GeneralPath)shapeText).quadTo(75.1404, 143.75424, 75.1404, 141.45503);
((GeneralPath)shapeText).quadTo(75.1404, 139.14304, 74.59966, 138.38515);
((GeneralPath)shapeText).quadTo(74.06317, 137.623, 73.258446, 137.623);
((GeneralPath)shapeText).quadTo(72.46649, 137.623, 71.99388, 138.29573);
((GeneralPath)shapeText).quadTo(71.39778, 139.15155, 71.39778, 141.45503);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(77.365105, 143.2646);
((GeneralPath)shapeText).lineTo(77.365105, 142.10648);
((GeneralPath)shapeText).lineTo(80.89483, 142.10648);
((GeneralPath)shapeText).lineTo(80.89483, 143.2646);
((GeneralPath)shapeText).lineTo(77.365105, 143.2646);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(81.84858, 141.45503);
((GeneralPath)shapeText).quadTo(81.84858, 139.79448, 82.18921, 138.78539);
((GeneralPath)shapeText).quadTo(82.52983, 137.77202, 83.20257, 137.22276);
((GeneralPath)shapeText).quadTo(83.879555, 136.67351, 84.901436, 136.67351);
((GeneralPath)shapeText).quadTo(85.65507, 136.67351, 86.22135, 136.97581);
((GeneralPath)shapeText).quadTo(86.7919, 137.2781, 87.16233, 137.85292);
((GeneralPath)shapeText).quadTo(87.53276, 138.42346, 87.741394, 139.24522);
((GeneralPath)shapeText).quadTo(87.954285, 140.06273, 87.954285, 141.45503);
((GeneralPath)shapeText).quadTo(87.954285, 143.1028, 87.61366, 144.11617);
((GeneralPath)shapeText).quadTo(87.27729, 145.12952, 86.6003, 145.68303);
((GeneralPath)shapeText).quadTo(85.92757, 146.23656, 84.901436, 146.23656);
((GeneralPath)shapeText).quadTo(83.54745, 146.23656, 82.77253, 145.2615);
((GeneralPath)shapeText).quadTo(81.84858, 144.09486, 81.84858, 141.45503);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(83.02799, 141.45503);
((GeneralPath)shapeText).quadTo(83.02799, 143.76276, 83.56874, 144.5249);
((GeneralPath)shapeText).quadTo(84.10948, 145.28706, 84.901436, 145.28706);
((GeneralPath)shapeText).quadTo(85.69338, 145.28706, 86.22987, 144.52065);
((GeneralPath)shapeText).quadTo(86.770615, 143.75424, 86.770615, 141.45503);
((GeneralPath)shapeText).quadTo(86.770615, 139.14304, 86.22987, 138.38515);
((GeneralPath)shapeText).quadTo(85.69338, 137.623, 84.88866, 137.623);
((GeneralPath)shapeText).quadTo(84.0967, 137.623, 83.62409, 138.29573);
((GeneralPath)shapeText).quadTo(83.02799, 139.15155, 83.02799, 141.45503);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(89.123055, 141.45503);
((GeneralPath)shapeText).quadTo(89.123055, 139.79448, 89.463684, 138.78539);
((GeneralPath)shapeText).quadTo(89.804306, 137.77202, 90.47704, 137.22276);
((GeneralPath)shapeText).quadTo(91.15403, 136.67351, 92.17591, 136.67351);
((GeneralPath)shapeText).quadTo(92.92954, 136.67351, 93.49583, 136.97581);
((GeneralPath)shapeText).quadTo(94.066376, 137.2781, 94.436806, 137.85292);
((GeneralPath)shapeText).quadTo(94.807236, 138.42346, 95.01587, 139.24522);
((GeneralPath)shapeText).quadTo(95.22876, 140.06273, 95.22876, 141.45503);
((GeneralPath)shapeText).quadTo(95.22876, 143.1028, 94.88814, 144.11617);
((GeneralPath)shapeText).quadTo(94.551765, 145.12952, 93.87478, 145.68303);
((GeneralPath)shapeText).quadTo(93.20204, 146.23656, 92.17591, 146.23656);
((GeneralPath)shapeText).quadTo(90.82192, 146.23656, 90.047005, 145.2615);
((GeneralPath)shapeText).quadTo(89.123055, 144.09486, 89.123055, 141.45503);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(90.30247, 141.45503);
((GeneralPath)shapeText).quadTo(90.30247, 143.76276, 90.843216, 144.5249);
((GeneralPath)shapeText).quadTo(91.38396, 145.28706, 92.17591, 145.28706);
((GeneralPath)shapeText).quadTo(92.96786, 145.28706, 93.50435, 144.52065);
((GeneralPath)shapeText).quadTo(94.04509, 143.75424, 94.04509, 141.45503);
((GeneralPath)shapeText).quadTo(94.04509, 139.14304, 93.50435, 138.38515);
((GeneralPath)shapeText).quadTo(92.96786, 137.623, 92.16313, 137.623);
((GeneralPath)shapeText).quadTo(91.37118, 137.623, 90.89857, 138.29573);
((GeneralPath)shapeText).quadTo(90.30247, 139.15155, 90.30247, 141.45503);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(96.39753, 141.45503);
((GeneralPath)shapeText).quadTo(96.39753, 139.79448, 96.73816, 138.78539);
((GeneralPath)shapeText).quadTo(97.07878, 137.77202, 97.75152, 137.22276);
((GeneralPath)shapeText).quadTo(98.428505, 136.67351, 99.450386, 136.67351);
((GeneralPath)shapeText).quadTo(100.20402, 136.67351, 100.7703, 136.97581);
((GeneralPath)shapeText).quadTo(101.34085, 137.2781, 101.71128, 137.85292);
((GeneralPath)shapeText).quadTo(102.08171, 138.42346, 102.290344, 139.24522);
((GeneralPath)shapeText).quadTo(102.503235, 140.06273, 102.503235, 141.45503);
((GeneralPath)shapeText).quadTo(102.503235, 143.1028, 102.16261, 144.11617);
((GeneralPath)shapeText).quadTo(101.82624, 145.12952, 101.149254, 145.68303);
((GeneralPath)shapeText).quadTo(100.47652, 146.23656, 99.450386, 146.23656);
((GeneralPath)shapeText).quadTo(98.0964, 146.23656, 97.32148, 145.2615);
((GeneralPath)shapeText).quadTo(96.39753, 144.09486, 96.39753, 141.45503);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(97.57694, 141.45503);
((GeneralPath)shapeText).quadTo(97.57694, 143.76276, 98.11769, 144.5249);
((GeneralPath)shapeText).quadTo(98.65843, 145.28706, 99.450386, 145.28706);
((GeneralPath)shapeText).quadTo(100.24233, 145.28706, 100.778824, 144.52065);
((GeneralPath)shapeText).quadTo(101.319565, 143.75424, 101.319565, 141.45503);
((GeneralPath)shapeText).quadTo(101.319565, 139.14304, 100.778824, 138.38515);
((GeneralPath)shapeText).quadTo(100.24233, 137.623, 99.43761, 137.623);
((GeneralPath)shapeText).quadTo(98.64565, 137.623, 98.17304, 138.29573);
((GeneralPath)shapeText).quadTo(97.57694, 139.15155, 97.57694, 141.45503);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(103.842316, 143.90753);
((GeneralPath)shapeText).lineTo(104.94935, 143.80534);
((GeneralPath)shapeText).quadTo(105.08986, 144.58452, 105.48583, 144.93791);
((GeneralPath)shapeText).quadTo(105.88181, 145.28706, 106.49919, 145.28706);
((GeneralPath)shapeText).quadTo(107.03142, 145.28706, 107.4274, 145.04436);
((GeneralPath)shapeText).quadTo(107.82763, 144.80167, 108.0831, 144.39717);
((GeneralPath)shapeText).quadTo(108.33857, 143.99268, 108.50888, 143.30292);
((GeneralPath)shapeText).quadTo(108.68345, 142.61314, 108.68345, 141.89784);
((GeneralPath)shapeText).quadTo(108.68345, 141.8212, 108.67919, 141.66792);
((GeneralPath)shapeText).quadTo(108.33431, 142.21718, 107.73396, 142.5578);
((GeneralPath)shapeText).quadTo(107.13786, 142.89842, 106.44384, 142.89842);
((GeneralPath)shapeText).quadTo(105.281456, 142.89842, 104.47673, 142.05537);
((GeneralPath)shapeText).quadTo(103.672005, 141.21233, 103.672005, 139.8328);
((GeneralPath)shapeText).quadTo(103.672005, 138.41069, 104.510796, 137.5421);
((GeneralPath)shapeText).quadTo(105.34959, 136.67351, 106.61416, 136.67351);
((GeneralPath)shapeText).quadTo(107.52959, 136.67351, 108.28322, 137.1674);
((GeneralPath)shapeText).quadTo(109.04111, 137.65706, 109.43282, 138.56822);
((GeneralPath)shapeText).quadTo(109.828804, 139.47514, 109.828804, 141.19955);
((GeneralPath)shapeText).quadTo(109.828804, 142.99635, 109.43709, 144.0608);
((GeneralPath)shapeText).quadTo(109.04962, 145.121, 108.27896, 145.67877);
((GeneralPath)shapeText).quadTo(107.50829, 146.23656, 106.47365, 146.23656);
((GeneralPath)shapeText).quadTo(105.37513, 146.23656, 104.67685, 145.62769);
((GeneralPath)shapeText).quadTo(103.98283, 145.01456, 103.842316, 143.90753);
((GeneralPath)shapeText).closePath();
((GeneralPath)shapeText).moveTo(108.55146, 139.77745);
((GeneralPath)shapeText).quadTo(108.55146, 138.78539, 108.02349, 138.20631);
((GeneralPath)shapeText).quadTo(107.49552, 137.623, 106.75466, 137.623);
((GeneralPath)shapeText).quadTo(105.98826, 137.623, 105.41771, 138.24889);
((GeneralPath)shapeText).quadTo(104.85142, 138.87479, 104.85142, 139.87112);
((GeneralPath)shapeText).quadTo(104.85142, 140.76526, 105.392166, 141.32729);
((GeneralPath)shapeText).quadTo(105.93291, 141.88507, 106.72486, 141.88507);
((GeneralPath)shapeText).quadTo(107.52107, 141.88507, 108.03626, 141.32729);
((GeneralPath)shapeText).quadTo(108.55146, 140.76526, 108.55146, 139.77745);
((GeneralPath)shapeText).closePath();
gText.fill(shapeText);
gText.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
    gText.dispose();
}
g.setTransform(defaultTransform__0_0_0_0_0_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_7 = g.getTransform();
g.transform(new AffineTransform(-0.7411100268363953f, 0.0f, 0.0f, 0.7040200233459473f, 97.23999786376953f, 68.87799835205078f));
// _0_0_0_0_0_7
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_7_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_7_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(47.032, 42.984);
((GeneralPath)shape).curveTo(46.911472, 42.990303, 46.804993, 43.01315, 46.68825, 43.0465);
((GeneralPath)shape).curveTo(46.100033, 43.21456, 43.872753, 44.4056, 43.56325, 44.9215);
((GeneralPath)shape).curveTo(43.072742, 45.73902, 44.14468, 50.572002, 44.407, 51.359);
((GeneralPath)shape).curveTo(44.734, 52.339993, 46.0047, 55.4449, 45.4382, 56.5778);
((GeneralPath)shape).curveTo(45.17393, 57.106342, 40.5993, 56.53452, 39.8132, 56.79655);
((GeneralPath)shape).curveTo(39.56666, 56.87873, 39.42224, 57.30453, 39.1882, 57.42155);
((GeneralPath)shape).curveTo(36.475403, 58.77795, 36.06, 60.65625, 38.157, 63.01535);
((GeneralPath)shape).curveTo(38.92805, 63.882782, 39.5336, 64.36895, 40.4382, 65.10915);
((GeneralPath)shape).curveTo(41.23719, 65.76287, 42.070503, 66.42635, 42.9382, 66.98415);
((GeneralPath)shape).curveTo(42.9466, 66.989555, 43.064632, 67.075676, 43.15695, 67.1404);
((GeneralPath)shape).curveTo(42.289303, 67.69818, 41.45595, 68.3617, 40.65695, 69.0154);
((GeneralPath)shape).curveTo(39.752293, 69.755585, 39.14675, 70.24171, 38.37575, 71.10921);
((GeneralPath)shape).curveTo(36.27885, 73.46821, 36.694252, 75.3466, 39.40695, 76.70301);
((GeneralPath)shape).curveTo(39.64099, 76.82003, 39.78541, 77.245834, 40.03195, 77.32801);
((GeneralPath)shape).curveTo(40.81805, 77.59004, 45.39265, 77.01822, 45.65695, 77.54676);
((GeneralPath)shape).curveTo(46.223362, 78.67956, 44.95269, 81.78456, 44.62575, 82.765564);
((GeneralPath)shape).curveTo(44.36343, 83.55252, 43.29145, 88.38557, 43.782, 89.203064);
((GeneralPath)shape).curveTo(44.09154, 89.71896, 46.3188, 90.909966, 46.907, 91.078064);
((GeneralPath)shape).curveTo(47.023743, 91.11141, 47.130222, 91.13426, 47.25075, 91.140564);
((GeneralPath)shape).curveTo(47.61235, 91.159325, 48.01152, 91.078064, 48.37575, 91.078064);
((GeneralPath)shape).curveTo(48.92625, 91.078064, 49.68745, 91.211075, 50.21955, 91.078064);
((GeneralPath)shape).curveTo(53.54225, 90.24738, 58.22095, 85.769966, 60.21955, 83.17187);
((GeneralPath)shape).curveTo(60.93426, 82.242744, 63.45195, 78.60547, 62.71955, 77.14067);
((GeneralPath)shape).curveTo(62.50651, 76.714584, 62.35495, 77.09552, 62.09455, 76.92192);
((GeneralPath)shape).curveTo(61.931282, 76.81307, 61.85157, 76.62452, 61.6883, 76.51567);
((GeneralPath)shape).curveTo(61.19084, 76.18403, 60.6258, 76.70851, 60.6258, 75.89067);
((GeneralPath)shape).curveTo(60.6258, 75.75192, 60.52769, 75.55128, 60.6258, 75.45317);
((GeneralPath)shape).curveTo(60.63691, 75.44206, 63.133102, 75.19518, 63.3446, 75.26567);
((GeneralPath)shape).curveTo(63.53076, 75.32772, 63.57534, 75.58416, 63.75085, 75.67192);
((GeneralPath)shape).curveTo(63.90943, 75.75121, 64.14, 75.59823, 64.188354, 75.45317);
((GeneralPath)shape).curveTo(64.412254, 74.78148, 64.301636, 71.902374, 64.188354, 71.10937);
((GeneralPath)shape).curveTo(64.09435, 70.45137, 63.775833, 69.65307, 63.563354, 69.015564);
((GeneralPath)shape).curveTo(63.376583, 68.455246, 63.440384, 67.65756, 63.500854, 66.92176);
((GeneralPath)shape).lineTo(63.250854, 66.92176);
((GeneralPath)shape).curveTo(63.200726, 66.2688, 63.181244, 65.59936, 63.344604, 65.10926);
((GeneralPath)shape).curveTo(63.557083, 64.47182, 63.875603, 63.673462, 63.969604, 63.01546);
((GeneralPath)shape).curveTo(64.082886, 62.22248, 64.193504, 59.34336, 63.969604, 58.67166);
((GeneralPath)shape).curveTo(63.921253, 58.5266, 63.690685, 58.373623, 63.532104, 58.45291);
((GeneralPath)shape).curveTo(63.356594, 58.540672, 63.312016, 58.79711, 63.125854, 58.85916);
((GeneralPath)shape).curveTo(62.914383, 58.929653, 60.418255, 58.68277, 60.407055, 58.67166);
((GeneralPath)shape).curveTo(60.308945, 58.57355, 60.407055, 58.37291, 60.407055, 58.23416);
((GeneralPath)shape).curveTo(60.407055, 57.41632, 60.972095, 57.9408, 61.469555, 57.60916);
((GeneralPath)shape).curveTo(61.632824, 57.500313, 61.712536, 57.31176, 61.875805, 57.20291);
((GeneralPath)shape).curveTo(62.136204, 57.029312, 62.287766, 57.41025, 62.500805, 56.98416);
((GeneralPath)shape).curveTo(63.233246, 55.51926, 60.715504, 51.88206, 60.000805, 50.95296);
((GeneralPath)shape).curveTo(58.002205, 48.35476, 53.323505, 43.87736, 50.000805, 43.04676);
((GeneralPath)shape).curveTo(49.468784, 42.91375, 48.707504, 43.04676, 48.157005, 43.04676);
((GeneralPath)shape).curveTo(47.792774, 43.04676, 47.393604, 42.9655, 47.032005, 42.98426);
((GeneralPath)shape).closePath();
paint = new Color(137, 93, 133, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_0_7_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_0_7_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_0_7_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(47.191, 48.61);
((GeneralPath)shape).curveTo(50.827503, 55.3453, 42.249302, 59.389, 41.9462, 63.784);
((GeneralPath)shape).curveTo(46.8872, 66.9692, 44.948803, 71.0035, 40.3067, 72.1003);
((GeneralPath)shape).curveTo(41.157143, 78.598206, 51.5997, 71.89862, 48.0064, 80.6586);
((GeneralPath)shape).curveTo(42.209103, 90.7296, 56.789402, 87.1692, 60.115402, 82.2457);
((GeneralPath)shape).curveTo(64.4092, 78.31239, 58.118202, 75.499695, 63.699, 74.13789);
((GeneralPath)shape).curveTo(61.9266, 66.74249, 62.093903, 59.404892, 57.6542, 52.442894);
((GeneralPath)shape).curveTo(55.631702, 48.134495, 51.0247, 47.654293, 47.366203, 46.784294);
paint = new Color(170, 102, 183, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_0_7_1);
g.setTransform(defaultTransform__0_0_0_0_0_7);
g.setTransform(defaultTransform__0_0_0_0_0);
g.setComposite(AlphaComposite.getInstance(3, 0.83178f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-82.237, 384.0);
((GeneralPath)shape).curveTo(-74.0273, 387.3505, -71.222, 388.1269, -62.84, 388.4452);
((GeneralPath)shape).curveTo(-59.6087, 388.5679, -45.059, 383.0726, -41.826, 382.9897);
((GeneralPath)shape).curveTo(-41.826, 382.9897, -35.2518, 392.2841, -22.249, 408.06268);
((GeneralPath)shape).curveTo(-21.675282, 408.75888, -17.654001, 406.42987, -18.471, 409.76227);
((GeneralPath)shape).curveTo(-21.5489, 422.31726, 0.3899994, 435.31726, 8.688, 442.19226);
((GeneralPath)shape).curveTo(8.96766, 442.0804, 9.341249, 442.04645, 9.49622, 441.78815);
((GeneralPath)shape).curveTo(11.55102, 438.36356, 9.317639, 441.31363, 9.90033, 439.56555);
((GeneralPath)shape).curveTo(10.177409, 438.7343, 11.398729, 435.95584, 11.92093, 435.12036);
((GeneralPath)shape).curveTo(14.00163, 431.79126, 18.79083, 424.41138, 18.79083, 424.41138);
((GeneralPath)shape).curveTo(18.79083, 424.41138, -2.53117, 401.37137, -13.740168, 395.11337);
((GeneralPath)shape).curveTo(-15.983368, 393.84546, -18.271368, 390.9326, -20.407967, 389.25378);
((GeneralPath)shape).curveTo(-27.763367, 383.4745, -25.406166, 385.2175, -35.763966, 379.55508);
((GeneralPath)shape).curveTo(-37.429264, 378.64474, -39.014866, 377.52847, -40.815365, 376.92838);
((GeneralPath)shape).curveTo(-41.342266, 376.75275, -41.885365, 377.23312, -42.431767, 377.3325);
((GeneralPath)shape).curveTo(-44.353268, 377.68185, -40.827465, 375.8826, -45.462566, 377.7366);
((GeneralPath)shape).curveTo(-47.616165, 378.59805, -49.651665, 379.7301, -51.726265, 380.7674);
((GeneralPath)shape).curveTo(-52.209805, 381.00916, -52.789864, 381.41766, -53.342667, 381.57562);
((GeneralPath)shape).curveTo(-60.524868, 383.62772, -73.774666, 385.4106, -82.236664, 384.00034);
((GeneralPath)shape).closePath();
paint = new Color(128, 128, 128, 255);
g.setPaint(paint);
g.fill(shape);
paint = new Color(77, 77, 77, 255);
stroke = new BasicStroke(1.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-82.237, 384.0);
((GeneralPath)shape).curveTo(-74.0273, 387.3505, -71.222, 388.1269, -62.84, 388.4452);
((GeneralPath)shape).curveTo(-59.6087, 388.5679, -45.059, 383.0726, -41.826, 382.9897);
((GeneralPath)shape).curveTo(-41.826, 382.9897, -35.2518, 392.2841, -22.249, 408.06268);
((GeneralPath)shape).curveTo(-21.675282, 408.75888, -17.654001, 406.42987, -18.471, 409.76227);
((GeneralPath)shape).curveTo(-21.5489, 422.31726, 0.3899994, 435.31726, 8.688, 442.19226);
((GeneralPath)shape).curveTo(8.96766, 442.0804, 9.341249, 442.04645, 9.49622, 441.78815);
((GeneralPath)shape).curveTo(11.55102, 438.36356, 9.317639, 441.31363, 9.90033, 439.56555);
((GeneralPath)shape).curveTo(10.177409, 438.7343, 11.398729, 435.95584, 11.92093, 435.12036);
((GeneralPath)shape).curveTo(14.00163, 431.79126, 18.79083, 424.41138, 18.79083, 424.41138);
((GeneralPath)shape).curveTo(18.79083, 424.41138, -2.53117, 401.37137, -13.740168, 395.11337);
((GeneralPath)shape).curveTo(-15.983368, 393.84546, -18.271368, 390.9326, -20.407967, 389.25378);
((GeneralPath)shape).curveTo(-27.763367, 383.4745, -25.406166, 385.2175, -35.763966, 379.55508);
((GeneralPath)shape).curveTo(-37.429264, 378.64474, -39.014866, 377.52847, -40.815365, 376.92838);
((GeneralPath)shape).curveTo(-41.342266, 376.75275, -41.885365, 377.23312, -42.431767, 377.3325);
((GeneralPath)shape).curveTo(-44.353268, 377.68185, -40.827465, 375.8826, -45.462566, 377.7366);
((GeneralPath)shape).curveTo(-47.616165, 378.59805, -49.651665, 379.7301, -51.726265, 380.7674);
((GeneralPath)shape).curveTo(-52.209805, 381.00916, -52.789864, 381.41766, -53.342667, 381.57562);
((GeneralPath)shape).curveTo(-60.524868, 383.62772, -73.774666, 385.4106, -82.236664, 384.00034);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2
g.setComposite(AlphaComposite.getInstance(3, 0.75543f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_0 = g.getTransform();
g.transform(new AffineTransform(0.9869899749755859f, 0.0f, 0.0f, 0.978630006313324f, -104.56999969482422f, 310.82000732421875f));
// _0_0_0_0_2_0
paint = new Color(0, 0, 0, 255);
stroke = new BasicStroke(4.9646f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.4074, 41.0);
((GeneralPath)shape).curveTo(5.4074, 60.095, 20.9044, 75.593, 40.000397, 75.593);
((GeneralPath)shape).curveTo(59.095398, 75.593, 74.5934, 60.096, 74.5934, 41.000004);
((GeneralPath)shape).curveTo(74.5934, 21.905005, 59.096397, 6.4070053, 40.0004, 6.4070053);
((GeneralPath)shape).curveTo(20.905401, 6.4070053, 5.407402, 21.904005, 5.407402, 41.000004);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_1 = g.getTransform();
g.transform(new AffineTransform(-1.0311000347137451f, -0.03793000057339668f, 0.04966599866747856f, -1.3436000347137451f, -27.29800033569336f, 385.25f));
// _0_0_0_0_2_1
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_1_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2_1_0
paint = new LinearGradientPaint(new Point2D.Double(34.84199905395508, -7.142499923706055), new Point2D.Double(35.56100082397461, 11.416000366210938), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.414f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.6228, 14.273);
((GeneralPath)shape).curveTo(16.524, 6.0827, 26.347801, 1.7529993, 37.1158, 1.7529993);
((GeneralPath)shape).curveTo(47.883797, 1.7529993, 58.4088, 7.2011995, 64.412796, 14.980999);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_2_1_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_1_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2_1_1
paint = new LinearGradientPaint(new Point2D.Double(34.84199905395508, -7.142499923706055), new Point2D.Double(35.56100082397461, 11.416000366210938), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.914f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.6228, 14.573);
((GeneralPath)shape).curveTo(16.524, 6.3827, 26.347801, 2.0529995, 37.1158, 2.0529995);
((GeneralPath)shape).curveTo(47.883797, 2.0529995, 58.4088, 7.5011997, 64.412796, 15.280999);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_2_1_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_1_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2_1_2
paint = new LinearGradientPaint(new Point2D.Double(34.84199905395508, -7.142499923706055), new Point2D.Double(35.56100082397461, 11.416000366210938), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.614f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(9.6228, 14.473);
((GeneralPath)shape).curveTo(16.524, 6.2826996, 26.347801, 1.9529991, 37.1158, 1.9529991);
((GeneralPath)shape).curveTo(47.883797, 1.9529991, 58.4088, 7.4011993, 64.412796, 15.180999);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_2_1_2);
g.setTransform(defaultTransform__0_0_0_0_2_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2_2
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2_2_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-38.284, 385.23);
((GeneralPath)shape).curveTo(-34.3457, 381.93262, -31.1235, 378.31122, -28.512402, 374.258);
((GeneralPath)shape).curveTo(-7.110401, 392.807, 5.342598, 404.57, 22.9086, 419.94098);
((GeneralPath)shape).curveTo(19.6089, 424.53506, 15.7764, 428.30518, 12.0436, 431.88397);
((GeneralPath)shape).curveTo(-4.7964, 415.69797, -11.756399, 410.95197, -38.2844, 385.22998);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(91.89399719238281, 98.322998046875), new Point2D.Double(102.63999938964844, 87.5780029296875), new float[] {0.0f,1.0f}, new Color[] {new Color(54, 54, 54, 255),new Color(179, 179, 179, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -105.08999633789062f, 309.8800048828125f));
g.setPaint(paint);
g.fill(shape);
paint = new Color(23, 23, 23, 113);
stroke = new BasicStroke(1.0f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-38.284, 385.23);
((GeneralPath)shape).curveTo(-34.3457, 381.93262, -31.1235, 378.31122, -28.512402, 374.258);
((GeneralPath)shape).curveTo(-7.110401, 392.807, 5.342598, 404.57, 22.9086, 419.94098);
((GeneralPath)shape).curveTo(19.6089, 424.53506, 15.7764, 428.30518, 12.0436, 431.88397);
((GeneralPath)shape).curveTo(-4.7964, 415.69797, -11.756399, 410.95197, -38.2844, 385.22998);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_2_2_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2_2_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-30.828, 377.52);
((GeneralPath)shape).lineTo(-34.4638, 381.6373);
((GeneralPath)shape).curveTo(-30.663898, 387.898, -22.1988, 397.3373, -10.278799, 408.5503);
((GeneralPath)shape).curveTo(-0.52239895, 417.728, 8.3852005, 424.7373, 14.8962, 428.94128);
((GeneralPath)shape).curveTo(17.1789, 426.8997, 18.5235, 425.3455, 20.0873, 423.5463);
((GeneralPath)shape).curveTo(15.396199, 417.1861, 7.3182993, 408.5623, -2.5167007, 399.3103);
((GeneralPath)shape).curveTo(-14.356701, 388.1733, -24.484701, 380.8293, -30.827702, 377.5193);
((GeneralPath)shape).closePath();
paint = new RadialGradientPaint(new Point2D.Double(3.9530999660491943, 74.83300018310547), 6.932f, new Point2D.Double(0.9055799841880798, 73.2959976196289), new float[] {0.0f,0.66372f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 61),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.4359700083732605f, -0.566100001335144f, 5.670899868011475f, 5.233699798583984f, -433.7300109863281f, 13.38700008392334f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_2_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_2_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2_2_2
g.setComposite(AlphaComposite.getInstance(3, 0.7326f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_2_2_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2_2_2_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-37.659, 384.96);
((GeneralPath)shape).curveTo(-34.4309, 381.9875, -31.3194, 378.44968, -28.633, 374.82498);
((GeneralPath)shape).curveTo(-11.816999, 389.19498, 5.7350006, 405.69098, 21.714, 419.74997);
((GeneralPath)shape).curveTo(18.2859, 424.27936, 17.086601, 426.46497, 12.201701, 430.83298);
((GeneralPath)shape).curveTo(-4.4082994, 414.86597, -21.6983, 400.28897, -37.659298, 384.95898);
((GeneralPath)shape).closePath();
paint = new RadialGradientPaint(new Point2D.Double(49.15700149536133, 62.38100051879883), 8.3332f, new Point2D.Double(45.900001525878906, 62.29800033569336), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.6268500089645386f, -0.7038300037384033f, 7.6057000160217285f, 6.891600131988525f, -534.4500122070312f, -18.267000198364258f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_2_2_0);
g.setComposite(AlphaComposite.getInstance(3, 0.74419f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_2_2_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2_2_2_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-36.597, 385.4);
((GeneralPath)shape).lineTo(-28.726799, 381.3865);
((GeneralPath)shape).curveTo(-11.910799, 395.7565, 2.7852, 407.3085, 20.0512, 420.7475);
((GeneralPath)shape).curveTo(17.5006, 425.9685, 15.791201, 426.2425, 11.364301, 430.5502);
((GeneralPath)shape).curveTo(-4.9847, 414.7262, -20.6357, 400.7292, -36.5967, 385.3992);
((GeneralPath)shape).closePath();
paint = new RadialGradientPaint(new Point2D.Double(39.0359992980957, 69.15299987792969), 8.3332f, new Point2D.Double(36.2859992980957, 69.15299987792969), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.6268500089645386f, -0.7038300037384033f, 7.6057000160217285f, 6.891600131988525f, -535.2899780273438f, -18.54599952697754f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_2_2_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_2_2_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2_2_2_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-28.666, 374.13);
((GeneralPath)shape).curveTo(-32.6043, 377.4274, -35.8338, 381.057, -38.4449, 385.11002);
((GeneralPath)shape).lineTo(-38.26895, 385.26944);
((GeneralPath)shape).curveTo(-34.33065, 381.97205, -31.10115, 378.34244, -28.490051, 374.28943);
((GeneralPath)shape).lineTo(-28.666, 374.13);
((GeneralPath)shape).closePath();
paint = new Color(92, 92, 92, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_2_2_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_2_2_3 = g.getTransform();
g.transform(new AffineTransform(0.68367999792099f, -0.7920500040054321f, 0.188960000872612f, 0.16405999660491943f, -78.21399688720703f, 412.69000244140625f));
// _0_0_0_0_2_2_2_3
shape = new Ellipse2D.Double(48.53860092163086, 49.94240188598633, 10.56879997253418, 3.707200050354004);
paint = new RadialGradientPaint(new Point2D.Double(53.823001861572266, 51.79600143432617), 5.2844f, new Point2D.Double(53.362998962402344, 53.70399856567383), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.35076001286506653f, 0.0f, 33.62799835205078f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_2_2_3);
g.setComposite(AlphaComposite.getInstance(3, 0.65116f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_2_2_4 = g.getTransform();
g.transform(new AffineTransform(0.672249972820282f, -0.8017799854278564f, 0.19213999807834625f, 0.16032999753952026f, -27.104000091552734f, 458.25f));
// _0_0_0_0_2_2_2_4
shape = new Ellipse2D.Double(48.53860092163086, 49.94240188598633, 10.56879997253418, 3.707200050354004);
paint = new RadialGradientPaint(new Point2D.Double(53.823001861572266, 51.79600143432617), 5.2844f, new Point2D.Double(53.362998962402344, 53.70399856567383), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.35076001286506653f, 0.0f, 33.62799835205078f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_2_2_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_2_2_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2_2_2_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-37.011, 370.07);
((GeneralPath)shape).curveTo(-39.165203, 372.69162, -41.1481, 374.9367, -43.091904, 376.933);
((GeneralPath)shape).lineTo(-36.558804, 382.94333);
((GeneralPath)shape).curveTo(-34.140404, 380.69342, -31.929504, 378.54523, -30.292004, 376.19962);
((GeneralPath)shape).lineTo(-37.011, 370.06992);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(28.07200050354004, 20.204999923706055), new Point2D.Double(40.19900131225586, 20.204999923706055), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(174, 174, 174, 255)}, MultipleGradientPaint.CycleMethod.REFLECT, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-0.35819000005722046f, 0.4021799862384796f, 0.3968200087547302f, 0.3595600128173828f, -33.88999938964844f, 356.5899963378906f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_2_2_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_2_2_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2_2_2_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-36.767, 371.22);
((GeneralPath)shape).curveTo(-38.9212, 373.8416, -40.7735, 375.3644, -42.7174, 377.3607);
((GeneralPath)shape).lineTo(-36.558, 382.94177);
((GeneralPath)shape).curveTo(-34.1396, 380.69186, -31.9287, 378.54367, -30.291199, 376.19806);
((GeneralPath)shape).lineTo(-36.767, 371.21997);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(67.51499938964844, 86.70600128173828), new Point2D.Double(63.402000427246094, 61.356998443603516), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0052000284194946f, 0.03706600144505501f, -0.03709600120782852f, 1.00600004196167f, -101.08000183105469f, 311.42999267578125f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_2_2_6);
g.setTransform(defaultTransform__0_0_0_0_2_2_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_2_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2_2_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(22.397, 419.85);
((GeneralPath)shape).curveTo(16.2911, 414.1099, 6.445999, 405.997, -4.983, 395.664);
((GeneralPath)shape).curveTo(-13.8197, 387.6748, -22.222, 380.30402, -28.657, 375.545);
((GeneralPath)shape).lineTo(-33.426598, 380.1473);
((GeneralPath)shape).curveTo(-28.044498, 386.0718, -19.903599, 394.4043, -11.066597, 402.3933);
((GeneralPath)shape).curveTo(0.36140347, 412.7253, 10.994404, 421.2203, 17.706404, 425.6373);
((GeneralPath)shape).lineTo(22.397604, 419.8492);
((GeneralPath)shape).closePath();
paint = new RadialGradientPaint(new Point2D.Double(-22.187999725341797, 69.9219970703125), 3.3125f, new Point2D.Double(-24.22599983215332, 69.91400146484375), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-0.8920699954032898f, 1.0390000343322754f, -21.232999801635742f, -18.231000900268555f, 1459.199951171875f, 1698.9000244140625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_2_3);
g.setComposite(AlphaComposite.getInstance(3, 0.8f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_2_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2_2_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-36.873, 370.17);
((GeneralPath)shape).curveTo(-37.84244, 371.46112, -38.9028, 372.6998, -40.0605, 373.8575);
((GeneralPath)shape).curveTo(-40.473183, 374.2702, -40.907433, 374.68365, -41.3417, 375.07632);
((GeneralPath)shape).curveTo(-41.363403, 375.09592, -41.382442, 375.11923, -41.4042, 375.13882);
((GeneralPath)shape).curveTo(-41.971962, 375.75613, -42.5335, 376.34683, -43.0917, 376.92);
((GeneralPath)shape).lineTo(-40.8105, 379.045);
((GeneralPath)shape).curveTo(-38.666203, 377.6895, -36.8135, 375.87842, -35.4355, 373.63882);
((GeneralPath)shape).curveTo(-35.14378, 373.1647, -34.88919, 372.6898, -34.65425, 372.20132);
((GeneralPath)shape).lineTo(-36.87305, 370.17014);
((GeneralPath)shape).closePath();
paint = new RadialGradientPaint(new Point2D.Double(56.25699996948242, 56.999000549316406), 9.7255f, new Point2D.Double(56.25699996948242, 56.999000549316406), new float[] {0.0f,0.66372f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 61),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.9252899885177612f, -99.09100341796875f, 320.1400146484375f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_2_4);
g.setComposite(AlphaComposite.getInstance(3, 0.1875f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_2_5 = g.getTransform();
g.transform(new AffineTransform(0.6643437579259793f, -0.7474271678931584f, 0.7474271678931584f, 0.6643437579259793f, 0.0f, 0.0f));
// _0_0_0_0_2_2_5
shape = new Rectangle2D.Double(-305.6099853515625, 218.85000610351562, 1.6519999504089355, 8.381999969482422);
paint = new LinearGradientPaint(new Point2D.Double(113.91999816894531, 47.0359992980957), new Point2D.Double(108.61000061035156, 69.37799835205078), new float[] {0.0f,1.0f}, new Color[] {new Color(86, 228, 253, 175),new Color(255, 255, 255, 181)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -420.2900085449219f, 160.38999938964844f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_2_5);
g.setTransform(defaultTransform__0_0_0_0_2_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_3 = g.getTransform();
g.transform(new AffineTransform(-5.3277997970581055f, 0.0f, 0.0f, 7.7866997718811035f, 87.01399993896484f, 392.5299987792969f));
// _0_0_0_0_2_3
paint = new LinearGradientPaint(new Point2D.Double(28.548999786376953, -10.10099983215332), new Point2D.Double(28.548999786376953, -0.8540199995040894), new float[] {0.0f,1.0f}, new Color[] {new Color(201, 202, 204, 255),new Color(172, 174, 177, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(0.62102f,1,1,4.0f,null,0.0f);
shape = new Ellipse2D.Double(22.167299270629883, -9.843700408935547, 12.763400077819824, 8.732799530029297);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_2_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2_4
paint = new RadialGradientPaint(new Point2D.Double(28.548999786376953, -5.47730016708374), 6.6922f, new Point2D.Double(28.548999786376953, -5.47730016708374), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 0),new Color(129, 129, 129, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(-5.37939977645874f, -1.0974999895552173E-6f, -5.982300081086578E-6f, 29.320999145507812f, 88.48799896240234f, 510.489990234375f));
stroke = new BasicStroke(4.0f,1,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-99.091, 349.88);
((GeneralPath)shape).curveTo(-99.091, 368.648, -83.859, 383.88, -65.091, 383.88);
((GeneralPath)shape).curveTo(-46.323006, 383.88, -31.091003, 368.648, -31.091003, 349.88);
((GeneralPath)shape).curveTo(-31.091003, 331.112, -46.323006, 315.88, -65.091, 315.88);
((GeneralPath)shape).curveTo(-83.859, 315.88, -99.091, 331.112, -99.091, 349.88);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_2_4);
g.setComposite(AlphaComposite.getInstance(3, 0.71f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(-65.248, 317.88);
((GeneralPath)shape).curveTo(-65.79382, 317.871, -66.3527, 317.8921, -66.9042, 317.9112);
((GeneralPath)shape).curveTo(-84.5542, 318.5255, -98.312195, 333.3522, -97.6232, 351.0052);
((GeneralPath)shape).curveTo(-97.39908, 356.74197, -95.672, 362.0652, -92.842, 366.6302);
((GeneralPath)shape).curveTo(-92.85964, 366.35657, -92.862495, 366.09323, -92.87325, 365.8177);
((GeneralPath)shape).curveTo(-93.56291, 348.16467, -79.80525, 333.33868, -62.15425, 332.7237);
((GeneralPath)shape).curveTo(-50.24025, 332.30902, -39.595253, 338.4611, -33.71625, 347.9427);
((GeneralPath)shape).curveTo(-34.79325, 331.2327, -48.59925, 318.14468, -65.24725, 317.88068);
((GeneralPath)shape).closePath();
paint = new RadialGradientPaint(new Point2D.Double(39.409000396728516, 9.579099655151367), 31.966f, new Point2D.Double(33.48400115966797, 10.614999771118164), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.7625700235366821f, -105.08999633789062f, 317.57000732421875f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_6 = g.getTransform();
g.transform(new AffineTransform(0.038472000509500504f, 1.1053999662399292f, 1.1382999420166016f, -0.04446899890899658f, -110.4000015258789f, 304.54998779296875f));
// _0_0_0_0_2_6
paint = new LinearGradientPaint(new Point2D.Double(13.645000457763672, 38.36800003051758), new Point2D.Double(71.4729995727539, 38.36800003051758), new float[] {0.0f,1.0f}, new Color[] {new Color(163, 165, 168, 255),new Color(255, 255, 255, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
stroke = new BasicStroke(1.7278f,1,1,4.0f,null,0.0f);
shape = new Ellipse2D.Double(14.50899887084961, 11.124000549316406, 56.099998474121094, 54.487998962402344);
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_0_0_0_2_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_7 = g.getTransform();
g.transform(new AffineTransform(1.2725000381469727f, 0.0f, 0.0f, 1.2725000381469727f, -100.70999908447266f, 321.2799987792969f));
// _0_0_0_0_2_7
g.setComposite(AlphaComposite.getInstance(3, 0.40625f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_7_0 = g.getTransform();
g.transform(new AffineTransform(0.9136800169944763f, 0.0f, 0.0f, 0.6306300163269043f, -393.989990234375f, 40.72100067138672f));
// _0_0_0_0_2_7_0
shape = new Ellipse2D.Double(440.6340026855469, -70.14599609375, 42.69200134277344, 40.13600158691406);
paint = new RadialGradientPaint(new Point2D.Double(461.9800109863281, -50.077999114990234), 21.346f, new Point2D.Double(461.54998779296875, -62.784000396728516), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.9244999885559082f, 8.883200166565075E-7f, -2.196299959678072E-7f, 0.9889900088310242f, -427.1099853515625f, -0.5516300201416016f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_7_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_7_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2_7_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(28.333, -1.7689);
((GeneralPath)shape).curveTo(14.895, -1.7689, 3.9820004, 9.1441, 3.9820004, 22.5821);
((GeneralPath)shape).curveTo(3.9820004, 36.0201, 14.895, 46.911102, 28.333, 46.911102);
((GeneralPath)shape).curveTo(41.771, 46.911102, 52.662003, 36.019104, 52.662003, 22.582102);
((GeneralPath)shape).curveTo(52.662003, 9.144102, 41.770004, -1.768898, 28.333002, -1.768898);
((GeneralPath)shape).closePath();
paint = new RadialGradientPaint(new Point2D.Double(654.5399780273438, -20.356000900268555), 38.29f, new Point2D.Double(653.77001953125, 3.276599884033203), new float[] {0.0f,0.57964f,0.8823f,1.0f}, new Color[] {new Color(162, 243, 255, 79),new Color(81, 210, 244, 119),new Color(56, 139, 201, 169),new Color(31, 68, 158, 220)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.635670006275177f, 0.0f, 0.0f, 0.635670006275177f, -387.739990234375f, 35.51100158691406f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_7_1);
g.setComposite(AlphaComposite.getInstance(3, 0.39062f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_7_2 = g.getTransform();
g.transform(new AffineTransform(0.7026399970054626f, 0.0f, 0.0f, 0.7026399970054626f, -333.2799987792969f, 26.423999786376953f));
// _0_0_0_0_2_7_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(514.84, -41.875);
((GeneralPath)shape).curveTo(495.23303, -41.875, 479.30902, -25.951, 479.30902, -6.344002);
((GeneralPath)shape).curveTo(479.30902, -2.9409018, 479.78867, 0.35289812, 480.68402, 3.4684982);
((GeneralPath)shape).curveTo(479.99997, 0.73939824, 479.62152, -2.1225019, 479.62152, -5.062702);
((GeneralPath)shape).curveTo(479.62152, -24.377703, 495.30652, -40.062702, 514.6215, -40.062702);
((GeneralPath)shape).curveTo(533.9365, -40.062702, 549.6215, -24.3777, 549.6215, -5.062702);
((GeneralPath)shape).curveTo(549.6215, 1.5766978, 547.7747, 7.7712975, 544.559, 13.062298);
((GeneralPath)shape).curveTo(548.2111, 7.482698, 550.3402, 0.8232975, 550.3402, -6.3437023);
((GeneralPath)shape).curveTo(550.3402, -25.950703, 534.4472, -41.874702, 514.8402, -41.874702);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(529.52001953125, -49.40800094604492), new Point2D.Double(529.1300048828125, -2.031899929046631), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_7_2);
g.setComposite(AlphaComposite.getInstance(3, 0.57031f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_7_3 = g.getTransform();
g.transform(new AffineTransform(0.7026399970054626f, 0.0f, 0.0f, 0.7026399970054626f, -266.5899963378906f, 26.423999786376953f));
// _0_0_0_0_2_7_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(385.94, -16.094);
((GeneralPath)shape).curveTo(384.7994, -12.5924, 384.19, -8.880899, 384.19, -5.0);
((GeneralPath)shape).curveTo(384.19, 14.819, 400.277, 30.905998, 420.096, 30.905998);
((GeneralPath)shape).curveTo(439.915, 30.905998, 455.971, 14.818998, 455.971, -5.0);
((GeneralPath)shape).curveTo(455.971, -8.8806, 455.36163, -12.592199, 454.221, -16.094);
((GeneralPath)shape).curveTo(455.1052, -12.9945, 455.596, -9.726, 455.596, -6.344);
((GeneralPath)shape).curveTo(455.596, 13.2630005, 439.703, 29.156, 420.096, 29.156);
((GeneralPath)shape).curveTo(400.489, 29.155998, 384.565, 13.2630005, 384.565, -6.344);
((GeneralPath)shape).curveTo(384.565, -9.726, 385.05582, -12.994499, 385.94, -16.094);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(425.9100036621094, 7.406199932098389), new Point2D.Double(426.2699890136719, -21.584999084472656), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_7_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_7_4 = g.getTransform();
g.transform(new AffineTransform(0.7026399970054626f, 0.0f, 0.0f, 0.7026399970054626f, -266.5899963378906f, 26.423999786376953f));
// _0_0_0_0_2_7_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(385.94, -16.094);
((GeneralPath)shape).curveTo(384.7994, -12.5924, 384.19, -8.880899, 384.19, -5.0);
((GeneralPath)shape).curveTo(384.19, 14.819, 400.277, 29.905998, 420.096, 29.905998);
((GeneralPath)shape).curveTo(439.915, 29.905998, 455.971, 14.818998, 455.971, -5.0);
((GeneralPath)shape).curveTo(455.971, -8.8806, 455.36163, -12.592199, 454.221, -16.094);
((GeneralPath)shape).curveTo(455.1052, -12.9945, 455.596, -9.726, 455.596, -6.344);
((GeneralPath)shape).curveTo(455.596, 13.2630005, 439.703, 29.156, 420.096, 29.156);
((GeneralPath)shape).curveTo(400.489, 29.155998, 384.565, 13.2630005, 384.565, -6.344);
((GeneralPath)shape).curveTo(384.565, -9.726, 385.05582, -12.994499, 385.94, -16.094);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(425.20001220703125, 35.691001892089844), new Point2D.Double(424.8599853515625, 12.001999855041504), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_7_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_7_5 = g.getTransform();
g.transform(new AffineTransform(0.7026399970054626f, 0.0f, 0.0f, 0.7026399970054626f, -333.2799987792969f, 26.423999786376953f));
// _0_0_0_0_2_7_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(514.84, -40.875);
((GeneralPath)shape).curveTo(495.23303, -40.875, 479.30902, -25.951, 479.30902, -6.344002);
((GeneralPath)shape).curveTo(479.30902, -2.9409018, 479.78867, 0.35289812, 480.68402, 3.4684982);
((GeneralPath)shape).curveTo(479.99997, 0.73939824, 479.62152, -2.1225019, 479.62152, -5.062702);
((GeneralPath)shape).curveTo(479.62152, -24.377703, 495.30652, -40.062702, 514.6215, -40.062702);
((GeneralPath)shape).curveTo(533.9365, -40.062702, 549.6215, -24.3777, 549.6215, -5.062702);
((GeneralPath)shape).curveTo(549.6215, 1.5766978, 547.7747, 7.7712975, 544.559, 13.062298);
((GeneralPath)shape).curveTo(548.2111, 7.482698, 550.3402, 0.8232975, 550.3402, -6.3437023);
((GeneralPath)shape).curveTo(550.3402, -25.950703, 534.4472, -40.874702, 514.8402, -40.874702);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(529.52001953125, -49.40800094604492), new Point2D.Double(529.6300048828125, -22.281999588012695), new float[] {0.0f,1.0f}, new Color[] {new Color(0, 0, 0, 255),new Color(0, 0, 0, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_7_5);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_7_6 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2_7_6
shape = new GeneralPath();
((GeneralPath)shape).moveTo(28.429, -3.5255);
((GeneralPath)shape).curveTo(14.458001, -3.5255, 3.1120014, 7.7024994, 3.1120014, 21.5275);
((GeneralPath)shape).curveTo(3.1120014, 26.8858, 4.8222013, 31.838501, 7.7231016, 35.9095);
((GeneralPath)shape).curveTo(5.0298014, 31.928501, 3.4634018, 27.1329, 3.4634018, 21.9665);
((GeneralPath)shape).curveTo(3.4634018, 8.189499, 14.652402, -2.9995003, 28.429401, -2.9995003);
((GeneralPath)shape).curveTo(42.2064, -2.9995003, 53.3734, 8.1895, 53.3734, 21.9665);
((GeneralPath)shape).curveTo(53.3734, 27.1329, 51.8031, 31.9285, 49.1137, 35.9095);
((GeneralPath)shape).curveTo(52.0104, 31.838001, 53.7248, 26.885601, 53.7248, 21.5275);
((GeneralPath)shape).curveTo(53.7248, 7.7015, 42.4008, -3.5265007, 28.4298, -3.5265007);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(455.3399963378906, -91.46199798583984), new Point2D.Double(452.6600036621094, -34.051998138427734), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.6517199873924255f, 0.0f, 0.0f, 0.6517199873924255f, -266.5899963378906f, 35.222999572753906f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_7_6);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_7_7 = g.getTransform();
g.transform(new AffineTransform(0.7026399970054626f, 0.0f, 0.0f, 0.7026399970054626f, -357.760009765625f, 26.423999786376953f));
// _0_0_0_0_2_7_7
shape = new GeneralPath();
((GeneralPath)shape).moveTo(549.12, -40.125);
((GeneralPath)shape).curveTo(529.996, -40.125, 514.464, -24.593, 514.464, -5.469002);
((GeneralPath)shape).curveTo(514.464, 12.078999, 527.565, 26.542, 544.495, 28.811996);
((GeneralPath)shape).curveTo(529.90497, 26.583696, 518.714, 13.989997, 518.714, -1.2190037);
((GeneralPath)shape).curveTo(518.714, -18.001003, 532.338, -31.625004, 549.12, -31.625004);
((GeneralPath)shape).curveTo(565.902, -31.625004, 579.526, -18.001003, 579.526, -1.2190037);
((GeneralPath)shape).curveTo(579.526, 14.513996, 567.567, 27.443996, 552.245, 28.999996);
((GeneralPath)shape).curveTo(569.911, 27.426996, 583.745, 12.606997, 583.745, -5.4690056);
((GeneralPath)shape).curveTo(583.745, -24.593006, 568.244, -40.125004, 549.12, -40.125004);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(552.25, 29.0);
((GeneralPath)shape).curveTo(551.73926, 29.05186, 551.2054, 29.09875, 550.6875, 29.125);
((GeneralPath)shape).curveTo(551.20624, 29.10194, 551.7375, 29.04564, 552.25, 29.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(544.5, 28.8125);
((GeneralPath)shape).curveTo(545.01154, 28.88111, 545.5129, 28.95397, 546.0312, 29.0);
((GeneralPath)shape).curveTo(545.5212, 28.948, 545.00116, 28.889, 544.50116, 28.812);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(546.03, 29.0005);
((GeneralPath)shape).curveTo(546.54016, 29.0458, 547.04504, 29.10255, 547.5612, 29.1255);
((GeneralPath)shape).curveTo(547.0433, 29.099249, 546.54083, 29.05236, 546.03, 29.0005);
((GeneralPath)shape).closePath();
paint = new RadialGradientPaint(new Point2D.Double(549.1099853515625, -5.5), 34.641f, new Point2D.Double(549.1099853515625, 15.369000434875488), new float[] {0.0f,0.795f,1.0f}, new Color[] {new Color(22, 54, 122, 0),new Color(22, 54, 122, 0),new Color(22, 54, 122, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 0.9995499849319458f, 0.0f, -0.0024808000307530165f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_7_7);
g.setComposite(AlphaComposite.getInstance(3, 0.40625f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_7_8 = g.getTransform();
g.transform(new AffineTransform(0.737309992313385f, 0.0f, 0.0f, 0.6411399841308594f, -307.55999755859375f, 33.86000061035156f));
// _0_0_0_0_2_7_8
shape = new Ellipse2D.Double(441.3970031738281, -52.3650016784668, 28.20599937438965, 35.06800079345703);
paint = new RadialGradientPaint(new Point2D.Double(455.5, -40.349998474121094), 14.103f, new Point2D.Double(455.5, -32.882999420166016), new float[] {0.0f,1.0f}, new Color[] {new Color(86, 228, 253, 175),new Color(255, 255, 255, 181)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.4865000247955322f, -8.41730013689812E-7f, 1.040699999066419E-6f, 1.8378000259399414f, -221.60000610351562f, 32.46500015258789f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_7_8);
g.setComposite(AlphaComposite.getInstance(3, 0.58984f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_7_9 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0_0_0_2_7_9
shape = new GeneralPath();
((GeneralPath)shape).moveTo(29.446, 0.21256);
((GeneralPath)shape).lineTo(29.64835, 4.43926);
((GeneralPath)shape).curveTo(31.32425, 4.469351, 32.95675, 4.62685, 34.52765, 4.87474);
((GeneralPath)shape).curveTo(34.20265, 3.4994402, 33.87965, 2.12434, 33.53965, 0.7504401);
((GeneralPath)shape).curveTo(32.22965, 0.45351014, 30.86165, 0.28429013, 29.44665, 0.2125001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(26.342999, 0.238178);
((GeneralPath)shape).curveTo(24.984999, 0.34142798, 23.662998, 0.565678, 22.407999, 0.878588);
((GeneralPath)shape).curveTo(22.046999, 2.335688, 21.696999, 3.799288, 21.352, 5.2589884);
((GeneralPath)shape).curveTo(22.967999, 4.8953886, 24.657, 4.6671886, 26.411, 4.5416884);
((GeneralPath)shape).lineTo(26.613379, 0.23818827);
((GeneralPath)shape).curveTo(26.521019, 0.24415827, 26.435518, 0.23119827, 26.34356, 0.23818827);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.011597, 1.467778);
((GeneralPath)shape).curveTo(36.427948, 2.779578, 36.838585, 4.095078, 37.2483, 5.412678);
((GeneralPath)shape).curveTo(40.2043, 6.1379776, 42.886997, 7.2236776, 45.1406, 8.614677);
((GeneralPath)shape).curveTo(43.3896, 5.4700775, 40.122597, 2.9144773, 36.011597, 1.4677773);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(19.574596, 1.775178);
((GeneralPath)shape).curveTo(15.172596, 3.5408778, 11.842596, 6.621478, 10.513597, 10.304978);
((GeneralPath)shape).curveTo(12.571596, 8.597178, 15.185596, 7.1941786, 18.158596, 6.1810784);
((GeneralPath)shape).curveTo(18.627596, 4.7133784, 19.096596, 3.2451785, 19.574596, 1.7751784);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(29.715595, 5.848178);
((GeneralPath)shape).lineTo(30.030375, 12.021678);
((GeneralPath)shape).curveTo(32.185276, 12.077718, 34.289974, 12.271188, 36.281273, 12.636468);
((GeneralPath)shape).curveTo(35.829273, 10.537468, 35.354275, 8.435167, 34.864273, 6.334268);
((GeneralPath)shape).curveTo(33.209274, 6.055868, 31.489273, 5.882668, 29.715273, 5.847568);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(26.342794, 5.925027);
((GeneralPath)shape).curveTo(24.479994, 6.061687, 22.696594, 6.366017, 20.991295, 6.7703667);
((GeneralPath)shape).curveTo(20.503614, 8.8699665, 20.047964, 10.968567, 19.597195, 13.071966);
((GeneralPath)shape).curveTo(21.643394, 12.5788965, 23.797094, 12.254356, 26.050495, 12.098546);
((GeneralPath)shape).lineTo(26.342495, 5.925546);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(37.720795, 6.949627);
((GeneralPath)shape).curveTo(38.386776, 9.108827, 39.053196, 11.287027, 39.699493, 13.456127);
((GeneralPath)shape).curveTo(42.113594, 14.140887, 44.323895, 15.030027, 46.287693, 16.120228);
((GeneralPath)shape).curveTo(46.451374, 15.381918, 46.535034, 14.638728, 46.535034, 13.866028);
((GeneralPath)shape).curveTo(46.535034, 12.736427, 46.339993, 11.662628, 45.995384, 10.612728);
((GeneralPath)shape).curveTo(43.685383, 9.031828, 40.877384, 7.775328, 37.720783, 6.949628);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(17.641794, 7.7437267);
((GeneralPath)shape).curveTo(14.657294, 8.824027, 12.052195, 10.311426, 10.041794, 12.098527);
((GeneralPath)shape).curveTo(9.941224, 12.678987, 9.884414, 13.265327, 9.884414, 13.866027);
((GeneralPath)shape).curveTo(9.884414, 14.898127, 10.042384, 15.895627, 10.334114, 16.863127);
((GeneralPath)shape).curveTo(11.905514, 15.868227, 13.669714, 14.994926, 15.5956135, 14.275927);
((GeneralPath)shape).curveTo(16.265123, 12.101927, 16.949913, 9.9205265, 17.641813, 7.7438264);
((GeneralPath)shape).closePath();
paint = new RadialGradientPaint(new Point2D.Double(419.6600036621094, -24.165000915527344), 27.473f, new Point2D.Double(419.6600036621094, -24.165000915527344), new float[] {0.0f,1.0f}, new Color[] {new Color(255, 255, 255, 255),new Color(255, 255, 255, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.7195299863815308f, 0.0f, 0.0f, 0.6485199928283691f, -273.739990234375f, 28.177000045776367f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_7_9);
g.setTransform(defaultTransform__0_0_0_0_2_7);
g.setComposite(AlphaComposite.getInstance(3, 0.45652f * origAlpha));
AffineTransform defaultTransform__0_0_0_0_2_8 = g.getTransform();
g.transform(new AffineTransform(0.6643437579259793f, -0.7474271678931584f, 0.7474271678931584f, 0.6643437579259793f, 0.0f, 0.0f));
// _0_0_0_0_2_8
shape = new Rectangle2D.Double(-304.29998779296875, 228.7899932861328, 0.75586998462677, 66.29399871826172);
paint = new LinearGradientPaint(new Point2D.Double(113.43000030517578, 55.402000427246094), new Point2D.Double(114.41999816894531, 118.7300033569336), new float[] {0.0f,1.0f}, new Color[] {new Color(202, 236, 243, 251),new Color(14, 82, 104, 0)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, -420.010009765625f, 170.0500030517578f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0_0_0_2_8);
g.setTransform(defaultTransform__0_0_0_0_2);
g.setTransform(defaultTransform__0_0_0_0);
g.setTransform(defaultTransform__0_0_0);
g.setTransform(defaultTransform__0_0);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.0;
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
		return 1122.519775390625;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 793.7008056640625;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private slidepreview1() {
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
       slidepreview1 base = new slidepreview1();
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
       slidepreview1 base = new slidepreview1();
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
        return slidepreview1::new;
    }
}

