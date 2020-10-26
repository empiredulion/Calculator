package com.example.calculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.String;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextView result, operator, operand;
    ArrayList<String> expres = new ArrayList<String>();
    String tmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        operand = findViewById(R.id.operand);
        expres.add("0");
        final String[] lastButt = {""};

        findViewById(R.id.button0).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                if (Objects.equals(result.getText(), "ERROR")
                        || Objects.equals(lastButt[0], "=")) {
                    result.setText("0");
                    operand.setText("");
                }
                else if (Objects.equals(result.getText().toString(), "0")) result.setText("0");
                else result.append("0");
                lastButt[0] = "0";
            }
        });

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if (Objects.equals(result.getText(), "ERROR")
                        || Objects.equals(lastButt[0], "=")) {
                    result.setText("1");
                    operand.setText("");
                }
                else if (Objects.equals(result.getText().toString(), "0")) result.setText("1");
                else result.append("1");
                lastButt[0] = "1";
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if (Objects.equals(result.getText(), "ERROR")
                        || Objects.equals(lastButt[0], "=")) {
                    result.setText("2");
                    operand.setText("");
                }
                else if (Objects.equals(result.getText().toString(), "0")) result.setText("2");
                else result.append("2");
                lastButt[0] = "2";
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if (Objects.equals(result.getText(), "ERROR")
                        || Objects.equals(lastButt[0], "=")) {
                    result.setText("3");
                    operand.setText("");
                }
                else if (Objects.equals(result.getText().toString(), "0")) result.setText("3");
                else result.append("3");
                lastButt[0] = "3";
            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if (Objects.equals(result.getText(), "ERROR")
                        || Objects.equals(lastButt[0], "=")) {
                    result.setText("4");
                    operand.setText("");
                }
                else if (Objects.equals(result.getText().toString(), "0")) result.setText("4");
                else result.append("4");
                lastButt[0] = "4";
            }
        });

        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if (Objects.equals(result.getText(), "ERROR")
                        || Objects.equals(lastButt[0], "=")) {
                    result.setText("5");
                    operand.setText("");
                }
                else if (Objects.equals(result.getText().toString(), "0")) result.setText("5");
                else result.append("5");
                lastButt[0] = "5";
            }
        });

        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if (Objects.equals(result.getText(), "ERROR")
                        || Objects.equals(lastButt[0], "=")) {
                    result.setText("6");
                    operand.setText("");
                }
                else if (Objects.equals(result.getText().toString(), "0")) result.setText("6");
                else result.append("6");
                lastButt[0] = "6";
            }
        });

        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if (Objects.equals(result.getText(), "ERROR")
                        || Objects.equals(lastButt[0], "=")) {
                    result.setText("7");
                    operand.setText("");
                }
                else if (Objects.equals(result.getText().toString(), "0")) result.setText("7");
                else result.append("7");
                lastButt[0] = "7";
            }
        });

        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if (Objects.equals(result.getText(), "ERROR")
                        || Objects.equals(lastButt[0], "=")) {
                    result.setText("8");
                    operand.setText("");
                }
                else if (Objects.equals(result.getText().toString(), "0")) result.setText("8");
                else result.append("8");
                lastButt[0] = "8";
            }
        });

        findViewById(R.id.button9).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if (Objects.equals(result.getText(), "ERROR")
                        || Objects.equals(lastButt[0], "=")) {
                    result.setText("9");
                    operand.setText("");
                }
                else if (Objects.equals(result.getText().toString(), "0")) result.setText("9");
                else result.append("9");
                lastButt[0] = "9";
            }
        });

        findViewById(R.id.buttonDot).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if (Objects.equals(lastButt[0], "="))
                    operand.setText("");
                if (!Objects.equals(result.getText().toString(), "ERROR")
                        && !Objects.equals(lastButt[0], ".")
                        && !result.getText().toString().contains("."))
                    result.append(".");
                lastButt[0] = ".";
                Log.d("mytag", "Clicked: " + lastButt[0]);
            }
        });

        findViewById(R.id.buttonC).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("0");
                operand.setText("");
                expres.clear();
                expres.add("0");
                lastButt[0] = "C";
            }
        });

        findViewById(R.id.buttonBS).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if (result.getText().toString().length() > 1) {
                    result.setText(result.getText().toString().substring(0,result.getText().toString().length() - 1));
                }
                else result.setText("0");
                lastButt[0] = "BS";
            }
        });

        findViewById(R.id.buttonCE).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText("0");
                lastButt[0] = "CE";
            }
        });

        findViewById(R.id.buttonOppo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tmp = Double.toString (0 - Double.parseDouble(result.getText().toString()));
                result.setText(tmp.contains(".") ? tmp.replaceAll("0*$","").replaceAll("\\.$","") : tmp);
                lastButt[0] = "+/-";
            }
        });

        findViewById(R.id.buttonPlus).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if (Objects.equals(lastButt[0], "+") ||
                        Objects.equals(lastButt[0], "-") ||
                        Objects.equals(lastButt[0], "*") ||
                        Objects.equals(lastButt[0], "/")) {
                    expres.set(expres.size()-1, "+");
                    operand.setText(operand.getText().toString().substring(0,operand.getText().toString().length() - 1));
                    operand.append("+");
                }
                else if (Objects.equals(lastButt[0], "=")) {
                    operand.setText("");
                    operand.append(result.getText());
                    operand.append("+");
                    expres.add("+");
                }
                else {
                    expres.add(result.getText().toString());
                    operand.append(result.getText());
                    operand.append("+");
                    expres.add("+");
                }
                result.setText("0");
                Log.d("mytag", Arrays.toString(expres.toArray()));
                lastButt[0] = "+";
            }
        });

        findViewById(R.id.buttonSub).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if (Objects.equals(lastButt[0], "+") ||
                        Objects.equals(lastButt[0], "-") ||
                        Objects.equals(lastButt[0], "*") ||
                        Objects.equals(lastButt[0], "/")) {
                    expres.set(expres.size()-1, "-");
                    operand.setText(operand.getText().toString().substring(0,operand.getText().toString().length() - 1));
                    operand.append("-");
                } else if (Objects.equals(lastButt[0], "=")) {
                    operand.setText("");
                    operand.append(result.getText());
                    operand.append("-");
                    expres.add("-");
                } else {
                    expres.add(result.getText().toString());
                    operand.append(result.getText());
                    operand.append("-");
                    expres.add("-");
                }
                result.setText("0");
                Log.d("mytag", Arrays.toString(expres.toArray()));
                lastButt[0] = "-";
            }
        });

        findViewById(R.id.buttonMul).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if (Objects.equals(lastButt[0], "+") ||
                        Objects.equals(lastButt[0], "-") ||
                        Objects.equals(lastButt[0], "*") ||
                        Objects.equals(lastButt[0], "/")) {
                    expres.set(expres.size()-1, "*");
                    operand.setText(operand.getText().toString().substring(0,operand.getText().toString().length() - 1));
                    operand.append("*");
                } else if (Objects.equals(lastButt[0], "=")) {
                    operand.setText("");
                    operand.append(result.getText());
                    operand.append("*");
                    expres.add("*");
                } else {
                    expres.add(result.getText().toString());
                    operand.append(result.getText());
                    operand.append("*");
                    expres.add("*");
                }
                result.setText("0");
                Log.d("mytag", Arrays.toString(expres.toArray()));
                lastButt[0] = "*";
            }
        });

        findViewById(R.id.buttonDiv).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                if (Objects.equals(lastButt[0], "+") ||
                        Objects.equals(lastButt[0], "-") ||
                        Objects.equals(lastButt[0], "*") ||
                        Objects.equals(lastButt[0], "/")) {
                    expres.set(expres.size()-1, "/");
                    operand.setText(operand.getText().toString().substring(0,operand.getText().toString().length() - 1));
                    operand.append("/");
                } else if (Objects.equals(lastButt[0], "=")) {
                    operand.setText("");
                    operand.append(result.getText());
                    operand.append("/");
                    expres.add("/");
                } else {
                    expres.add(result.getText().toString());
                    operand.append(result.getText());
                    operand.append("/");
                    expres.add("/");
                }
                result.setText("0");
                Log.d("mytag", Arrays.toString(expres.toArray()));
                lastButt[0] = "/";
            }
        });

        findViewById(R.id.buttonEqual).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View view) {
                boolean isZero = false;
                if (Objects.equals(result.getText(), "ERROR"))
                    result.setText("0");
                if (Objects.equals(lastButt[0], "="))
                    operand.setText("");
                tmp = result.getText().toString();
                result.setText(tmp.contains(".") ? tmp.replaceAll("0*$","").replaceAll("\\.$","") : tmp);
                expres.add(result.getText().toString());
                operand.append(result.getText().toString());
                expres.remove(0);
                Log.d("mytag", Arrays.toString(expres.toArray()));
                for (int j = 0; j < expres.size()-1; j++) {
                    if (Objects.equals(expres.get(j), "/") && Objects.equals(expres.get(j + 1), "0")) {
                        result.setText("ERROR");
                        isZero = true;
                        Log.d("mytag", "/0");
                    }
                }
                Log.v("mytag", "" + isZero);
                if (!isZero) {
                    for (int i = 1; i < expres.size() - 1; i++) {
                        Log.d("mytag", Arrays.toString(expres.toArray()));
                        if (Objects.equals(expres.get(i), "*")) {
                            expres.set(i - 1, Double.toString(Double.parseDouble(expres.get(i - 1)) * Double.parseDouble(expres.get(i + 1))));
                            Log.d("mytag", Arrays.toString(expres.toArray()));
                            expres.remove(i);
                            expres.remove(i);
                            i--;
                        } else if (Objects.equals(expres.get(i), "/")) {
                            expres.set(i - 1, Double.toString(Double.parseDouble(expres.get(i - 1)) / Double.parseDouble(expres.get(i + 1))));
                            Log.d("mytag", Arrays.toString(expres.toArray()));
                            expres.remove(i);
                            expres.remove(i);
                            i--;
                        }
                    }
                    for (int i = 1; i < expres.size() - 1; i++) {
                        if (Objects.equals(expres.get(i), "+")) {
                            expres.set(i - 1, Double.toString(Double.parseDouble(expres.get(i - 1)) + Double.parseDouble(expres.get(i + 1))));
                            Log.d("mytag", Arrays.toString(expres.toArray()));
                            expres.remove(i);
                            expres.remove(i);
                            i--;
                        } else if (Objects.equals(expres.get(i), "-")) {
                            expres.set(i - 1, Double.toString(Double.parseDouble(expres.get(i - 1)) - Double.parseDouble(expres.get(i + 1))));
                            Log.d("mytag", Arrays.toString(expres.toArray()));
                            expres.remove(i);
                            expres.remove(i);
                            i--;
                        }
                    }
                    result.setText(expres.get(0).contains(".") ? expres.get(0).replaceAll("0*$","").replaceAll("\\.$","") : expres.get(0));
                }
                expres.add(expres.get(0));
                expres.set(0, "0");
                lastButt[0] = "=";
            }
        });
    }
}