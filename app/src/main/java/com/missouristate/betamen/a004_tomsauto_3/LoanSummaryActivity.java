package com.missouristate.betamen.a004_tomsauto_3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoanSummaryActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loansummary_layout);
        TextView monthlyPayET = findViewById(R.id.textView2);
        TextView loanReportET = findViewById(R.id.textView3);

        // PASS DATA
        Intent intent = getIntent();

        String report;
        report = intent.getStringExtra("LoanReport");

        String monthlyPay;
        monthlyPay = intent.getStringExtra("MonthlyPayment");
        monthlyPayET.setText(monthlyPay);
        loanReportET.setText(report);
    }
    public void onStart( ) {                                                                 // added on Start activity
        super.onStart( );
        updateView( );
    }
    public void updateView( ) {                                                             // update view passed from purchse activity
        String montPayment =  PurchaseActivity.monthlyPayment ;
        TextView mPayment = findViewById(R.id.textView2);
        mPayment.setText(montPayment);
        String loanReport =  PurchaseActivity.loanReport ;
        TextView mLoan = findViewById(R.id.textView3);
        mLoan.setText(loanReport);
    }

    public void goDataEntry(View view) {
  finish();
    }
}
