import java.awt.Color;
public class TetrisPiece {
   private TetrisBlock[] blocks;
   private Color color;

   TetrisPiece(TetrisBlock[] blocks, Color color) {
      this.blocks = blocks;
      this.color = color;
   }

   public int[][] getShape() {
      int maxX = 0;
      int maxY = 0;

      // dimensoes máximas lag e alt da peça
      for(TetrisBlock block : blocks) {
         if(block.getX() > maxX) {
            maxX = block.getX();
         }
         if(block.getY() > maxY) {
            maxY = block.getY();
         }
      }

      // matriz com as dimensoes máximas e é iniciado com espaços vazios
      int[][] shape = new int[maxY + 1][maxX + 1];

      // Preencha a matriz com os blocos da peça
      for (TetrisBlock block : blocks) {
         shape[block.getY()][block.getX()] = 1;
      }

      return shape;
   }
   public void moveLeft() {
      for (TetrisBlock block : blocks) {
         block.setX(block.getX() - 1);
      }
   }

   public void moveRight() {
      for (TetrisBlock block : blocks) {
         block.setX(block.getX() + 1);
      }
   }

   public void moveDown() {
      for (TetrisBlock block : blocks) {
         block.setY(block.getY() + 1);
      }
   }

   public void rotate() {
      int[][] originalShape = getShape();
      int[][] rotatedShape = new int[originalShape[0].length][originalShape.length];

      // rotação da matriz
      for(int i = 0; i < originalShape.length; i++) {
         for(int j = 0; j < originalShape[i].length; j++) {
            rotatedShape[j][originalShape.length - 1 - i] = originalShape[i][j];
         }
      }
      setShape(rotatedShape);
   }

   public TetrisBlock[] getBlocks() {
      return blocks;
   }

   public Color getColor() {
      return color;
   }
}
