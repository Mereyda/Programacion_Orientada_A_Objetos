package clase11A;

public abstract class Cuenta {
  protected Cliente clientex;
  protected int saldo;


  public Cuenta(Cliente clientex, int saldo) {
    this.clientex = clientex;
    this.saldo = saldo;
  }

  public abstract int depositarSaldo();

  public abstract int depositar();


  public abstract int depositar(int dinero);

  public abstract void extraerEfectivo();

  public abstract void informarSaldo();
  public abstract void cobrarIntereses();
}
