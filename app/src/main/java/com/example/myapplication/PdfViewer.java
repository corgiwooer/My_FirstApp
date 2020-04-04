package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

import static com.example.myapplication.MainActivity.ads;
import static com.example.myapplication.MainActivity.count;
import static com.example.myapplication.MainActivity.interstitialAd;

public class PdfViewer extends AppCompatActivity {
    PDFView myPDFViewer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_viewer);

        String getItem = getIntent().getStringExtra("pdfFileName");
        myPDFViewer = findViewById(R.id.pdfView);
        Toast.makeText(getApplicationContext(),""+count,Toast.LENGTH_SHORT).show();
        if (count==5){
            count=0;
            ads();
        }
        interstitialAd.loadAd();
        assert getItem != null;
        if (getItem.equals("First")) {
            myPDFViewer.fromAsset("1.PDF")
                    .defaultPage(0)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableSwipe(true)
                    .swipeHorizontal(false)
                    .load();
        }

        if (getItem.equals("Second")) {
            myPDFViewer.fromAsset("2.PDF")
                    .defaultPage(0)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableSwipe(true)
                    .swipeHorizontal(false)
                    .load();
        }

        if (getItem.equals("Third")) {
            myPDFViewer.fromAsset("3.PDF")
                    .defaultPage(0)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableSwipe(true)
                    .swipeHorizontal(false)
                    .load();
        }

        if (getItem.equals("Four")) {
            myPDFViewer.fromAsset("4.PDF")
                    .defaultPage(0)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableSwipe(true)
                    .swipeHorizontal(false)
                    .load();
        }

        if (getItem.equals("Five")) {
            myPDFViewer.fromAsset("5.PDF")
                    .defaultPage(0)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableSwipe(true)
                    .swipeHorizontal(false)
                    .load();
        }

        if (getItem.equals("Six")) {
            myPDFViewer.fromAsset("6.PDF")
                    .defaultPage(0)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableSwipe(true)
                    .swipeHorizontal(false)
                    .load();
        }

        if (getItem.equals("Seven")) {
            myPDFViewer.fromAsset("7.PDF")
                    .defaultPage(0)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableSwipe(true)
                    .swipeHorizontal(false)
                    .load();
        }

        if (getItem.equals("Eight")) {
            myPDFViewer.fromAsset("8.PDF")
                    .defaultPage(0)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableSwipe(true)
                    .swipeHorizontal(false)
                    .load();
        }

        if (getItem.equals("Nine")) {
            myPDFViewer.fromAsset("9.PDF")
                    .defaultPage(0)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableSwipe(true)
                    .swipeHorizontal(false)
                    .load();
        }

        if (getItem.equals("Ten")) {
            myPDFViewer.fromAsset("10.PDF")
                    .defaultPage(0)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .enableSwipe(true)
                    .swipeHorizontal(false)
                    .load();
        }
    }
}
