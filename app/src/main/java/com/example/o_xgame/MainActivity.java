package com.example.o_xgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar myToolbar;
    androidx.cardview.widget.CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6, cardView7, cardView8, cardView9;
    ImageView cardView1_o, cardView1_x, cardView1_free,
            cardView2_o, cardView2_x, cardView2_free,
            cardView3_o, cardView3_x, cardView3_free,
            cardView4_o, cardView4_x, cardView4_free,
            cardView5_o, cardView5_x, cardView5_free,
            cardView6_o, cardView6_x, cardView6_free,
            cardView7_o, cardView7_x, cardView7_free,
            cardView8_o, cardView8_x, cardView8_free,
            cardView9_o, cardView9_x, cardView9_free;
    ImageView cardView1_orow, cardView1_xrow, cardView1_ocol, cardView1_xcol, cardView1_omajor, cardView1_xmajor,
            cardView2_orow, cardView2_xrow, cardView2_ocol, cardView2_xcol,
            cardView3_orow, cardView3_xrow, cardView3_ocol, cardView3_xcol, cardView3_odiagonal, cardView3_xdiagonal,
            cardView4_orow, cardView4_xrow, cardView4_ocol, cardView4_xcol,
            cardView5_orow, cardView5_ocol, cardView5_omajor, cardView5_odiagonal, cardView5_xrow, cardView5_xcol, cardView5_xmajor, cardView5_xdiagonal,
            cardView6_orow, cardView6_ocol, cardView6_xrow, cardView6_xcol,
            cardView7_orow, cardView7_ocol, cardView7_odiagonal, cardView7_xrow, cardView7_xcol, cardView7_xdiagonal,
            cardView8_orow, cardView8_ocol, cardView8_xrow, cardView8_xcol,
            cardView9_orow, cardView9_ocol, cardView9_omajor, cardView9_xrow, cardView9_xcol, cardView9_xmajor;
    TextView showOWin, showXWin, showDraw;
    Button play_again;
    TextView owins, draws, xwins;
    int count = 0;
    int[] arr = new int[]{-10, -10, -10, -10, -10, -10, -10, -10, -10, -10};
    int draw = 0, xwin = 0, owin = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        cardView1 = findViewById(R.id.card1);
        cardView2 = findViewById(R.id.card2);
        cardView3 = findViewById(R.id.card3);
        cardView4 = findViewById(R.id.card4);
        cardView5 = findViewById(R.id.card5);
        cardView6 = findViewById(R.id.card6);
        cardView7 = findViewById(R.id.card7);
        cardView8 = findViewById(R.id.card8);
        cardView9 = findViewById(R.id.card9);

        cardView1_orow = findViewById(R.id.card1_oh);
        cardView1_xrow = findViewById(R.id.card1_xh);
        cardView1_ocol = findViewById(R.id.card1_ov);
        cardView1_xcol = findViewById(R.id.card1_xv);
        cardView1_omajor = findViewById(R.id.card1_om);
        cardView1_xmajor = findViewById(R.id.card1_xm);
        cardView2_orow = findViewById(R.id.card2_oh);
        cardView2_xrow = findViewById(R.id.card2_xh);
        cardView2_ocol = findViewById(R.id.card2_ov);
        cardView2_xcol = findViewById(R.id.card2_xv);
        cardView3_orow = findViewById(R.id.card3_oh);
        cardView3_xrow = findViewById(R.id.card3_xh);
        cardView3_ocol = findViewById(R.id.card3_ov);
        cardView3_xcol = findViewById(R.id.card3_xv);
        cardView3_odiagonal = findViewById(R.id.card3_od);
        cardView3_xdiagonal = findViewById(R.id.card3_xd);
        cardView4_orow = findViewById(R.id.card4_oh);
        cardView4_xrow = findViewById(R.id.card4_xh);
        cardView4_ocol = findViewById(R.id.card4_ov);
        cardView4_xcol = findViewById(R.id.card4_xv);
        cardView5_orow = findViewById(R.id.card5_oh);
        cardView5_xrow = findViewById(R.id.card5_xh);
        cardView5_ocol = findViewById(R.id.card5_ov);
        cardView5_xcol = findViewById(R.id.card5_xv);
        cardView5_omajor = findViewById(R.id.card5_om);
        cardView5_xmajor = findViewById(R.id.card5_xm);
        cardView5_odiagonal = findViewById(R.id.card5_od);
        cardView5_xdiagonal = findViewById(R.id.card5_xd);
        cardView6_orow = findViewById(R.id.card6_oh);
        cardView6_xrow = findViewById(R.id.card6_xh);
        cardView6_ocol = findViewById(R.id.card6_ov);
        cardView6_xcol = findViewById(R.id.card6_xv);
        cardView7_orow = findViewById(R.id.card7_oh);
        cardView7_xrow = findViewById(R.id.card7_xh);
        cardView7_ocol = findViewById(R.id.card7_ov);
        cardView7_xcol = findViewById(R.id.card7_xv);
        cardView7_odiagonal = findViewById(R.id.card7_od);
        cardView7_xdiagonal = findViewById(R.id.card7_xd);
        cardView8_orow = findViewById(R.id.card8_oh);
        cardView8_xrow = findViewById(R.id.card8_xh);
        cardView8_ocol = findViewById(R.id.card8_ov);
        cardView8_xcol = findViewById(R.id.card8_xv);
        cardView9_orow = findViewById(R.id.card9_oh);
        cardView9_xrow = findViewById(R.id.card9_xh);
        cardView9_ocol = findViewById(R.id.card9_ov);
        cardView9_xcol = findViewById(R.id.card9_xv);
        cardView9_omajor = findViewById(R.id.card9_om);
        cardView9_xmajor = findViewById(R.id.card9_xm);

        cardView1_x = findViewById(R.id.card1_x);
        cardView1_o = findViewById(R.id.card1_o);
        cardView1_free = findViewById(R.id.card1_free);
        cardView2_x = findViewById(R.id.card2_x);
        cardView2_o = findViewById(R.id.card2_o);
        cardView2_free = findViewById(R.id.card2_free);
        cardView3_x = findViewById(R.id.card3_x);
        cardView3_o = findViewById(R.id.card3_o);
        cardView3_free = findViewById(R.id.card3_free);
        cardView4_x = findViewById(R.id.card4_x);
        cardView4_o = findViewById(R.id.card4_o);
        cardView4_free = findViewById(R.id.card4_free);
        cardView5_x = findViewById(R.id.card5_x);
        cardView5_o = findViewById(R.id.card5_o);
        cardView5_free = findViewById(R.id.card5_free);
        cardView6_x = findViewById(R.id.card6_x);
        cardView6_o = findViewById(R.id.card6_o);
        cardView6_free = findViewById(R.id.card6_free);
        cardView7_x = findViewById(R.id.card7_x);
        cardView7_o = findViewById(R.id.card7_o);
        cardView7_free = findViewById(R.id.card7_free);
        cardView8_x = findViewById(R.id.card8_x);
        cardView8_o = findViewById(R.id.card8_o);
        cardView8_free = findViewById(R.id.card8_free);
        cardView9_x = findViewById(R.id.card9_x);
        cardView9_o = findViewById(R.id.card9_o);
        cardView9_free = findViewById(R.id.card9_free);

        showOWin = findViewById(R.id.showowin);
        showXWin = findViewById(R.id.showxwin);
        showDraw = findViewById(R.id.showdraw);
        play_again = findViewById(R.id.playagain);
        owins = findViewById(R.id.owins);
        draws = findViewById(R.id.draw);
        xwins = findViewById(R.id.xwins);


        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (count % 2 == 0 && count < 9) {
                    if (arr[1] == -10) {
                        cardView1_o.setVisibility(View.VISIBLE);
                        cardView1_x.setVisibility(View.GONE);
                        cardView1_free.setVisibility(View.GONE);
                        arr[1] = 2;
                        count++;

                        if (check() == 2) {
                            owin++;
                            showOWin.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;

                        }

                        if (check() == 11) {
                            draw++;
                            showDraw.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;
                        }
                    }
                } else if (count % 2 != 0 && count < 9) {
                    if (arr[1] == -10) {
                        cardView1_x.setVisibility(View.VISIBLE);
                        cardView1_o.setVisibility(View.GONE);
                        cardView1_free.setVisibility(View.GONE);
                        arr[1] = 1;
                        count++;

                        if (check() == 1) {
                            xwin++;
                            showXWin.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;
                        }


                        if (check() == 11) {
                            draw++;
                            showDraw.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;
                        }

                    }
                }

                updateScore();

            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 == 0 && count < 9) {
                    if (arr[2] == -10) {
                        cardView2_o.setVisibility(View.VISIBLE);
                        cardView2_x.setVisibility(View.GONE);
                        cardView2_free.setVisibility(View.GONE);
                        arr[2] = 2;
                        count++;

                        if (check() == 2) {
                            owin++;
                            showOWin.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;

                        }


                        if (check() == 11) {
                            draw++;
                            showDraw.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;
                        }
                    }
                } else if (count % 2 != 0 && count < 9) {
                    if (arr[2] == -10) {
                        cardView2_x.setVisibility(View.VISIBLE);
                        cardView2_o.setVisibility(View.GONE);
                        cardView2_free.setVisibility(View.GONE);
                        arr[2] = 1;
                        count++;

                        if (check() == 1) {
                            //X WIN
                            xwin++;
                            showXWin.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;

                        }

                        if (check() == 11) {
                            draw++;
                            showDraw.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;
                        }
                    }
                }
                updateScore();

            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 == 0 && count < 9) {
                    if (arr[3] == -10) {
                        cardView3_o.setVisibility(View.VISIBLE);
                        cardView3_x.setVisibility(View.GONE);
                        cardView3_free.setVisibility(View.GONE);
                        arr[3] = 2;
                        count++;

                        if (check() == 2) {
                            //O WIN
                            owin++;
                            showOWin.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;

                        }

                        if (check() == 11) {
                            draw++;
                            showDraw.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;
                        }
                    }
                } else if (count % 2 != 0 && count < 9) {
                    if (arr[3] == -10) {
                        cardView3_x.setVisibility(View.VISIBLE);
                        cardView3_o.setVisibility(View.GONE);
                        cardView3_free.setVisibility(View.GONE);
                        arr[3] = 1;
                        count++;

                        if (check() == 1) {
                            //X WIN
                            xwin++;
                            showXWin.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;

                        }

                        if (check() == 11) {
                            draw++;
                            showDraw.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;
                        }
                    }
                }

                updateScore();

            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 == 0 && count < 9) {
                    if (arr[4] == -10) {
                        cardView4_o.setVisibility(View.VISIBLE);
                        cardView4_x.setVisibility(View.GONE);
                        cardView4_free.setVisibility(View.GONE);
                        arr[4] = 2;
                        count++;

                        if (check() == 2) {
                            //O WIN
                            owin++;
                            showOWin.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;

                        }

                        if (check() == 11) {
                            draw++;
                            showDraw.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;
                        }
                    }
                } else if (count % 2 != 0 && count < 9) {
                    if (arr[4] == -10) {
                        cardView4_x.setVisibility(View.VISIBLE);
                        cardView4_o.setVisibility(View.GONE);
                        cardView4_free.setVisibility(View.GONE);
                        arr[4] = 1;
                        count++;
                        if (check() == 1) {
                            //X WIN
                            xwin++;
                            showXWin.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;

                        }

                        if (check() == 11) {
                            draw++;
                            showDraw.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;
                        }
                    }
                }


                updateScore();

            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 == 0 && count < 9) {
                    if (arr[5] == -10) {
                        cardView5_o.setVisibility(View.VISIBLE);
                        cardView5_x.setVisibility(View.GONE);
                        cardView5_free.setVisibility(View.GONE);
                        arr[5] = 2;
                        count++;

                        if (check() == 2) {
                            //O WIN
                            owin++;
                            showOWin.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;

                        }

                        if (check() == 11) {
                            draw++;
                            showDraw.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;
                        }
                    }
                } else if (count % 2 != 0 && count < 9) {
                    if (arr[5] == -10) {
                        cardView5_x.setVisibility(View.VISIBLE);
                        cardView5_o.setVisibility(View.GONE);
                        cardView5_free.setVisibility(View.GONE);
                        arr[5] = 1;
                        count++;

                        if (check() == 1) {
                            //X WIN
                            xwin++;
                            showXWin.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;

                        }

                        if (check() == 11) {
                            draw++;
                            showDraw.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;
                        }
                    }
                }
                updateScore();

            }
        });

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 == 0 && count < 9) {
                    if (arr[6] == -10) {
                        cardView6_o.setVisibility(View.VISIBLE);
                        cardView6_x.setVisibility(View.GONE);
                        cardView6_free.setVisibility(View.GONE);
                        arr[6] = 2;
                        count++;

                        if (check() == 2) {
                            //O WIN
                            owin++;
                            showOWin.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;

                        }

                        if (check() == 11) {
                            draw++;
                            showDraw.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;
                        }
                    }
                } else if (count % 2 != 0 && count < 9) {
                    if (arr[6] == -10) {
                        cardView6_x.setVisibility(View.VISIBLE);
                        cardView6_o.setVisibility(View.GONE);
                        cardView6_free.setVisibility(View.GONE);
                        arr[6] = 1;
                        count++;

                        if (check() == 1) {
                            //X WIN
                            xwin++;
                            showXWin.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;

                        }

                        if (check() == 11) {
                            draw++;
                            showDraw.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;
                        }
                    }
                }

                updateScore();

            }
        });

        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 == 0 && count < 9) {
                    if (arr[7] == -10) {
                        cardView7_o.setVisibility(View.VISIBLE);
                        cardView7_x.setVisibility(View.GONE);
                        cardView7_free.setVisibility(View.GONE);
                        arr[7] = 2;
                        count++;

                        if (check() == 2) {
                            //O WIN
                            owin++;
                            showOWin.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;

                        }

                        if (check() == 11) {
                            draw++;
                            showDraw.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;
                        }
                    }
                } else if (count % 2 != 0 && count < 9) {
                    if (arr[7] == -10) {
                        cardView7_x.setVisibility(View.VISIBLE);
                        cardView7_o.setVisibility(View.GONE);
                        cardView7_free.setVisibility(View.GONE);
                        arr[7] = 1;
                        count++;

                        if (check() == 1) {
                            //X WIN
                            xwin++;
                            showXWin.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;

                        }

                        if (check() == 11) {
                            draw++;
                            showDraw.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;
                        }
                    }
                }

                updateScore();

            }
        });

        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 == 0 && count < 9) {
                    if (arr[8] == -10) {
                        cardView8_o.setVisibility(View.VISIBLE);
                        cardView8_x.setVisibility(View.GONE);
                        cardView8_free.setVisibility(View.GONE);
                        arr[8] = 2;
                        count++;
                        if (check() == 2) {
                            //O WIN
                            owin++;
                            showOWin.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;

                        }

                        if (check() == 11) {
                            draw++;
                            showDraw.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;
                        }
                    }
                } else if (count % 2 != 0 && count < 9) {
                    if (arr[8] == -10) {
                        cardView8_x.setVisibility(View.VISIBLE);
                        cardView8_o.setVisibility(View.GONE);
                        cardView8_free.setVisibility(View.GONE);
                        arr[8] = 1;
                        count++;

                        if (check() == 1) {
                            //X WIN
                            xwin++;
                            showXWin.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;

                        }

                        if (check() == 11) {
                            draw++;
                            showDraw.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;
                        }
                    }
                }
                updateScore();

            }
        });

        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count % 2 == 0 && count < 9) {
                    if (arr[9] == -10) {
                        cardView9_o.setVisibility(View.VISIBLE);
                        cardView9_x.setVisibility(View.GONE);
                        cardView9_free.setVisibility(View.GONE);
                        arr[9] = 2;
                        count++;
                        if (check() == 2) {
                            //O WIN
                            owin++;
                            showOWin.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;

                        }

                        if (check() == 11) {
                            draw++;
                            showDraw.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;
                        }
                    }
                } else if (count % 2 != 0 && count < 9) {
                    if (arr[9] == -10) {
                        cardView9_x.setVisibility(View.VISIBLE);
                        cardView9_o.setVisibility(View.GONE);
                        cardView9_free.setVisibility(View.GONE);
                        arr[9] = 1;
                        count++;
                        if (check() == 1) {
                            //X WIN
                            xwin++;
                            showXWin.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;

                        }

                        if (check() == 11) {
                            draw++;
                            showDraw.setVisibility(View.VISIBLE);
                            play_again.setVisibility(View.VISIBLE);
                            count = 10;
                        }
                    }
                }

                updateScore();

            }
        });

        play_again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                arr[1] = -10;
                arr[2] = -10;
                arr[3] = -10;
                arr[4] = -10;
                arr[5] = -10;
                arr[6] = -10;
                arr[7] = -10;
                arr[8] = -10;
                arr[9] = -10;


                play_again.setVisibility(View.GONE);
                showOWin.setVisibility(View.GONE);
                showXWin.setVisibility(View.GONE);
                showDraw.setVisibility(View.GONE);

                cardView1_o.setVisibility(View.GONE);
                cardView1_x.setVisibility(View.GONE);
                cardView1_orow.setVisibility(View.GONE);
                cardView1_xrow.setVisibility(View.GONE);
                cardView1_ocol.setVisibility(View.GONE);
                cardView1_xcol.setVisibility(View.GONE);
                cardView1_xmajor.setVisibility(View.GONE);
                cardView1_omajor.setVisibility(View.GONE);

                cardView2_o.setVisibility(View.GONE);
                cardView2_x.setVisibility(View.GONE);
                cardView2_orow.setVisibility(View.GONE);
                cardView2_xrow.setVisibility(View.GONE);
                cardView2_ocol.setVisibility(View.GONE);
                cardView2_xcol.setVisibility(View.GONE);

                cardView3_o.setVisibility(View.GONE);
                cardView3_x.setVisibility(View.GONE);
                cardView3_orow.setVisibility(View.GONE);
                cardView3_xrow.setVisibility(View.GONE);
                cardView3_ocol.setVisibility(View.GONE);
                cardView3_xcol.setVisibility(View.GONE);
                cardView3_odiagonal.setVisibility(View.GONE);
                cardView3_xdiagonal.setVisibility(View.GONE);

                cardView4_o.setVisibility(View.GONE);
                cardView4_x.setVisibility(View.GONE);
                cardView4_orow.setVisibility(View.GONE);
                cardView4_xrow.setVisibility(View.GONE);
                cardView4_ocol.setVisibility(View.GONE);
                cardView4_xcol.setVisibility(View.GONE);

                cardView5_o.setVisibility(View.GONE);
                cardView5_x.setVisibility(View.GONE);
                cardView5_orow.setVisibility(View.GONE);
                cardView5_xrow.setVisibility(View.GONE);
                cardView5_ocol.setVisibility(View.GONE);
                cardView5_xcol.setVisibility(View.GONE);
                cardView5_odiagonal.setVisibility(View.GONE);
                cardView5_xdiagonal.setVisibility(View.GONE);
                cardView5_omajor.setVisibility(View.GONE);
                cardView5_xmajor.setVisibility(View.GONE);

                cardView6_o.setVisibility(View.GONE);
                cardView6_x.setVisibility(View.GONE);
                cardView6_orow.setVisibility(View.GONE);
                cardView6_xrow.setVisibility(View.GONE);
                cardView6_ocol.setVisibility(View.GONE);
                cardView6_xcol.setVisibility(View.GONE);

                cardView7_o.setVisibility(View.GONE);
                cardView7_x.setVisibility(View.GONE);
                cardView7_orow.setVisibility(View.GONE);
                cardView7_xrow.setVisibility(View.GONE);
                cardView7_ocol.setVisibility(View.GONE);
                cardView7_xcol.setVisibility(View.GONE);
                cardView7_odiagonal.setVisibility(View.GONE);
                cardView7_xdiagonal.setVisibility(View.GONE);

                cardView8_o.setVisibility(View.GONE);
                cardView8_x.setVisibility(View.GONE);
                cardView8_orow.setVisibility(View.GONE);
                cardView8_xrow.setVisibility(View.GONE);
                cardView8_ocol.setVisibility(View.GONE);
                cardView8_xcol.setVisibility(View.GONE);

                cardView9_o.setVisibility(View.GONE);
                cardView9_x.setVisibility(View.GONE);
                cardView9_orow.setVisibility(View.GONE);
                cardView9_xrow.setVisibility(View.GONE);
                cardView9_ocol.setVisibility(View.GONE);
                cardView9_xcol.setVisibility(View.GONE);
                cardView9_omajor.setVisibility(View.GONE);
                cardView9_xmajor.setVisibility(View.GONE);


                //Show free grids

                cardView1_free.setVisibility(View.VISIBLE);
                cardView2_free.setVisibility(View.VISIBLE);
                cardView3_free.setVisibility(View.VISIBLE);
                cardView4_free.setVisibility(View.VISIBLE);
                cardView5_free.setVisibility(View.VISIBLE);
                cardView6_free.setVisibility(View.VISIBLE);
                cardView7_free.setVisibility(View.VISIBLE);
                cardView8_free.setVisibility(View.VISIBLE);
                cardView9_free.setVisibility(View.VISIBLE);


            }
        });
    }

    int check() {
        int row1 = arr[1] + arr[2] + arr[3];
        int row2 = arr[4] + arr[5] + arr[6];
        int row3 = arr[7] + arr[8] + arr[9];
        int col1 = arr[1] + arr[4] + arr[7];
        int col2 = arr[2] + arr[5] + arr[8];
        int col3 = arr[3] + arr[6] + arr[9];
        int major_diagonal = arr[1] + arr[5] + arr[9];
        int diagonal = arr[3] + arr[5] + arr[7];

        if (row1 == 6 || row2 == 6 || row3 == 6 || col1 == 6 || col2 == 6 || col3 == 6 || major_diagonal == 6 || diagonal == 6) {
            if (row1 == 6) {
                cardView1_orow.setVisibility(View.VISIBLE);
                cardView2_orow.setVisibility(View.VISIBLE);
                cardView3_orow.setVisibility(View.VISIBLE);

                cardView1_o.setVisibility(View.GONE);
                cardView2_o.setVisibility(View.GONE);
                cardView3_o.setVisibility(View.GONE);


            } else if (row2 == 6) {
                cardView4_orow.setVisibility(View.VISIBLE);
                cardView5_orow.setVisibility(View.VISIBLE);
                cardView6_orow.setVisibility(View.VISIBLE);

                cardView4_o.setVisibility(View.GONE);
                cardView5_o.setVisibility(View.GONE);
                cardView6_o.setVisibility(View.GONE);


            } else if (row3 == 6) {
                cardView7_orow.setVisibility(View.VISIBLE);
                cardView8_orow.setVisibility(View.VISIBLE);
                cardView9_orow.setVisibility(View.VISIBLE);

                cardView7_o.setVisibility(View.GONE);
                cardView8_o.setVisibility(View.GONE);
                cardView9_o.setVisibility(View.GONE);

            } else if (col1 == 6) {
                cardView1_ocol.setVisibility(View.VISIBLE);
                cardView4_ocol.setVisibility(View.VISIBLE);
                cardView7_ocol.setVisibility(View.VISIBLE);

                cardView1_o.setVisibility(View.GONE);
                cardView4_o.setVisibility(View.GONE);
                cardView7_o.setVisibility(View.GONE);

            } else if (col2 == 6) {
                cardView2_ocol.setVisibility(View.VISIBLE);
                cardView5_ocol.setVisibility(View.VISIBLE);
                cardView8_ocol.setVisibility(View.VISIBLE);

                cardView2_o.setVisibility(View.GONE);
                cardView5_o.setVisibility(View.GONE);
                cardView8_o.setVisibility(View.GONE);

            } else if (col3 == 6) {
                cardView3_ocol.setVisibility(View.VISIBLE);
                cardView6_ocol.setVisibility(View.VISIBLE);
                cardView9_ocol.setVisibility(View.VISIBLE);

                cardView3_o.setVisibility(View.GONE);
                cardView6_o.setVisibility(View.GONE);
                cardView9_o.setVisibility(View.GONE);

            } else if (major_diagonal == 6) {
                cardView1_omajor.setVisibility(View.VISIBLE);
                cardView5_omajor.setVisibility(View.VISIBLE);
                cardView9_omajor.setVisibility(View.VISIBLE);

                cardView1_o.setVisibility(View.GONE);
                cardView5_o.setVisibility(View.GONE);
                cardView9_o.setVisibility(View.GONE);
            } else {
                cardView3_odiagonal.setVisibility(View.VISIBLE);
                cardView5_odiagonal.setVisibility(View.VISIBLE);
                cardView7_odiagonal.setVisibility(View.VISIBLE);

                cardView3_o.setVisibility(View.GONE);
                cardView5_o.setVisibility(View.GONE);
                cardView7_o.setVisibility(View.GONE);
            }
            return 2;
        } else if (row1 == 3 || row2 == 3 || row3 == 3 || col1 == 3 || col2 == 3 || col3 == 3 || major_diagonal == 3 || diagonal == 3) {
            if (row1 == 3) {
                cardView1_xrow.setVisibility(View.VISIBLE);
                cardView2_xrow.setVisibility(View.VISIBLE);
                cardView3_xrow.setVisibility(View.VISIBLE);

                cardView1_x.setVisibility(View.GONE);
                cardView2_x.setVisibility(View.GONE);
                cardView3_x.setVisibility(View.GONE);
            } else if (row2 == 3) {
                cardView4_xrow.setVisibility(View.VISIBLE);
                cardView5_xrow.setVisibility(View.VISIBLE);
                cardView6_xrow.setVisibility(View.VISIBLE);

                cardView4_x.setVisibility(View.GONE);
                cardView5_x.setVisibility(View.GONE);
                cardView6_x.setVisibility(View.GONE);
            } else if (row3 == 3) {
                cardView7_xrow.setVisibility(View.VISIBLE);
                cardView8_xrow.setVisibility(View.VISIBLE);
                cardView9_xrow.setVisibility(View.VISIBLE);

                cardView7_x.setVisibility(View.GONE);
                cardView8_x.setVisibility(View.GONE);
                cardView9_x.setVisibility(View.GONE);
            } else if (col1 == 3) {
                cardView1_xcol.setVisibility(View.VISIBLE);
                cardView4_xcol.setVisibility(View.VISIBLE);
                cardView7_xcol.setVisibility(View.VISIBLE);

                cardView1_x.setVisibility(View.GONE);
                cardView4_x.setVisibility(View.GONE);
                cardView7_x.setVisibility(View.GONE);
            } else if (col2 == 3) {
                cardView2_xcol.setVisibility(View.VISIBLE);
                cardView5_xcol.setVisibility(View.VISIBLE);
                cardView8_xcol.setVisibility(View.VISIBLE);

                cardView2_x.setVisibility(View.GONE);
                cardView5_x.setVisibility(View.GONE);
                cardView8_x.setVisibility(View.GONE);
            } else if (col3 == 3) {
                cardView3_xcol.setVisibility(View.VISIBLE);
                cardView6_xcol.setVisibility(View.VISIBLE);
                cardView9_xcol.setVisibility(View.VISIBLE);

                cardView3_x.setVisibility(View.GONE);
                cardView6_x.setVisibility(View.GONE);
                cardView9_x.setVisibility(View.GONE);

            } else if (major_diagonal == 3) {
                cardView1_xmajor.setVisibility(View.VISIBLE);
                cardView5_xmajor.setVisibility(View.VISIBLE);
                cardView9_xmajor.setVisibility(View.VISIBLE);

                cardView1_x.setVisibility(View.GONE);
                cardView5_x.setVisibility(View.GONE);
                cardView9_x.setVisibility(View.GONE);
            } else {
                cardView3_xdiagonal.setVisibility(View.VISIBLE);
                cardView5_xdiagonal.setVisibility(View.VISIBLE);
                cardView7_xdiagonal.setVisibility(View.VISIBLE);

                cardView3_x.setVisibility(View.GONE);
                cardView5_x.setVisibility(View.GONE);
                cardView7_x.setVisibility(View.GONE);
            }
            return 1;
        } else if (count >= 9) {
            count = 10;
            return 11;
        } else return -1;
    }

    void updateScore() {
        String o, d, x;
        o = Integer.toString(owin);
        x = Integer.toString(xwin);
        d = Integer.toString(draw);

        owins.setText(o);
        xwins.setText(x);
        draws.setText(d);
    }
}