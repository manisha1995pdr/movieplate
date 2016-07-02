package com.example.megha.movieplate.CelebsFormat;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.megha.movieplate.Constants;
import com.example.megha.movieplate.Database_Connect.Image_Converter;
import com.example.megha.movieplate.Database_Connect.SQL_Helper;
import com.example.megha.movieplate.R;
import com.squareup.picasso.Picasso;

/**
 * Created by HIman$hu on 4/2/2016.
 */
public class CelebsLinearLayoutFragment extends Fragment {

    ImageView iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8, iv9, iv10;
    TextView ntv1, ntv2, ntv3, ntv4, ntv5, ntv6, ntv7, ntv8, ntv9, ntv10;
    TextView mtv1, mtv2, mtv3, mtv4, mtv5, mtv6, mtv7, mtv8, mtv9, mtv10;
    View view;
    Bundle b;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.activity_celebs_linear_layout_fragments, container, false);
        SQL_Helper helper=new SQL_Helper(getActivity(),1);
        SQLiteDatabase db=helper.getReadableDatabase();
        Cursor c=db.query(true, helper.CELEB_TABLE_NAME, new String[]{helper._ID, helper.TABLE_IMAGE, helper.TABLE_OBJECT}, null, null, null, null, helper._ID, null);
        c.moveToNext();
        b = getArguments();
        final Celebs celebs = (Celebs) b.getSerializable(Constants.CELEBS_TO_LINEAR_LAYOUT_FRAGMENT);

        iv1 = (ImageView) view.findViewById(R.id.imageView1);
        iv2 = (ImageView) view.findViewById(R.id.imageView2);
        iv3 = (ImageView) view.findViewById(R.id.imageView3);
        iv4 = (ImageView) view.findViewById(R.id.imageView4);
        iv5 = (ImageView) view.findViewById(R.id.imageView5);
        iv6 = (ImageView) view.findViewById(R.id.imageView6);
        iv7 = (ImageView) view.findViewById(R.id.imageView7);
        iv8 = (ImageView) view.findViewById(R.id.imageView8);
        iv9 = (ImageView) view.findViewById(R.id.imageView9);
        iv10 = (ImageView) view.findViewById(R.id.imageView10);

        ntv1 = (TextView) view.findViewById(R.id.NameTextView1);
        mtv1 = (TextView) view.findViewById(R.id.MoviesListTextView1);

        ntv2 = (TextView) view.findViewById(R.id.NameTextView2);
        mtv2 = (TextView) view.findViewById(R.id.MoviesListTextView2);

        ntv3 = (TextView) view.findViewById(R.id.NameTextView3);
        mtv3 = (TextView) view.findViewById(R.id.MoviesListTextView3);

        ntv4 = (TextView) view.findViewById(R.id.NameTextView4);
        mtv4 = (TextView) view.findViewById(R.id.MoviesListTextView4);

        ntv5 = (TextView) view.findViewById(R.id.NameTextView5);
        mtv5 = (TextView) view.findViewById(R.id.MoviesListTextView5);

        ntv6 = (TextView) view.findViewById(R.id.NameTextView6);
        mtv6 = (TextView) view.findViewById(R.id.MoviesListTextView6);

        ntv7 = (TextView) view.findViewById(R.id.NameTextView7);
        mtv7 = (TextView) view.findViewById(R.id.MoviesListTextView7);

        ntv8 = (TextView) view.findViewById(R.id.NameTextView8);
        mtv8 = (TextView) view.findViewById(R.id.MoviesListTextView8);

        ntv9 = (TextView) view.findViewById(R.id.NameTextView9);
        mtv9 = (TextView) view.findViewById(R.id.MoviesListTextView9);

        ntv10 = (TextView) view.findViewById(R.id.NameTextView10);
        mtv10 = (TextView) view.findViewById(R.id.MoviesListTextView10);

        if (b != null) {
            int i=c.getColumnIndex(helper.TABLE_IMAGE);
            byte[] img_byte;
            Bitmap img;
            img_byte=c.getBlob(i);
            img= Image_Converter.getImage(img_byte);
            iv1.setImageBitmap(img);
            ntv1.setText(celebs.CelebsList.get(0).getName());
            mtv1.setText(celebs.CelebsList.get(0).MoviesList.get(0).getOriginal_title() + "," + celebs.CelebsList.get(0).MoviesList.get(1).getOriginal_title() + "," +
                    celebs.CelebsList.get(0).MoviesList.get(2).getOriginal_title());
            c.moveToNext();

            img_byte=c.getBlob(i);
            img= Image_Converter.getImage(img_byte);
            iv2.setImageBitmap(img);
            ntv2.setText(celebs.CelebsList.get(1).getName());
            mtv2.setText(celebs.CelebsList.get(1).MoviesList.get(0).getOriginal_title() + "," + celebs.CelebsList.get(1).MoviesList.get(1).getOriginal_title() + "," +
                    celebs.CelebsList.get(1).MoviesList.get(2).getOriginal_title());

            c.moveToNext();
            img_byte=c.getBlob(i);
            img= Image_Converter.getImage(img_byte);
            iv3.setImageBitmap(img);
            ntv3.setText(celebs.CelebsList.get(2).getName());
            mtv3.setText(celebs.CelebsList.get(2).MoviesList.get(0).getOriginal_title() + "," + celebs.CelebsList.get(2).MoviesList.get(1).getOriginal_title() + "," +
                    celebs.CelebsList.get(2).MoviesList.get(2).getOriginal_title());

            c.moveToNext();
            img_byte=c.getBlob(i);
            img= Image_Converter.getImage(img_byte);
            iv4.setImageBitmap(img);
            ntv4.setText(celebs.CelebsList.get(3).getName());
            mtv4.setText(celebs.CelebsList.get(3).MoviesList.get(0).getOriginal_title() + "," + celebs.CelebsList.get(3).MoviesList.get(1).getOriginal_title() + "," +
                    celebs.CelebsList.get(3).MoviesList.get(2).getOriginal_title());

            c.moveToNext();
            img_byte=c.getBlob(i);
            img= Image_Converter.getImage(img_byte);
            iv5.setImageBitmap(img);
            ntv5.setText(celebs.CelebsList.get(4).getName());
            mtv5.setText(celebs.CelebsList.get(4).MoviesList.get(0).getOriginal_title() + "," + celebs.CelebsList.get(4).MoviesList.get(1).getOriginal_title() + "," +
                    celebs.CelebsList.get(4).MoviesList.get(2).getOriginal_title());

            c.moveToNext();
            img_byte=c.getBlob(i);
            img= Image_Converter.getImage(img_byte);
            iv6.setImageBitmap(img);
            ntv6.setText(celebs.CelebsList.get(5).getName());
            mtv6.setText(celebs.CelebsList.get(5).MoviesList.get(0).getOriginal_title() + "," + celebs.CelebsList.get(5).MoviesList.get(1).getOriginal_title() + "," +
                    celebs.CelebsList.get(5).MoviesList.get(2).getOriginal_title());

            c.moveToNext();
            img_byte=c.getBlob(i);
            img= Image_Converter.getImage(img_byte);
            iv7.setImageBitmap(img);
            ntv7.setText(celebs.CelebsList.get(6).getName());
            mtv7.setText(celebs.CelebsList.get(6).MoviesList.get(0).getOriginal_title() + "," + celebs.CelebsList.get(6).MoviesList.get(1).getOriginal_title() + "," +
                    celebs.CelebsList.get(6).MoviesList.get(2).getOriginal_title());

            c.moveToNext();
            img_byte=c.getBlob(i);
            img= Image_Converter.getImage(img_byte);
            iv8.setImageBitmap(img);
            ntv8.setText(celebs.CelebsList.get(7).getName());
            mtv8.setText(celebs.CelebsList.get(7).MoviesList.get(0).getOriginal_title() + "," + celebs.CelebsList.get(7).MoviesList.get(1).getOriginal_title() + "," +
                    celebs.CelebsList.get(7).MoviesList.get(2).getOriginal_title());
            c.moveToNext();
            img_byte=c.getBlob(i);
            img= Image_Converter.getImage(img_byte);
            iv9.setImageBitmap(img);
            ntv9.setText(celebs.CelebsList.get(8).getName());
            mtv9.setText(celebs.CelebsList.get(8).MoviesList.get(0).getOriginal_title() + "," + celebs.CelebsList.get(8).MoviesList.get(1).getOriginal_title() + "," +
                    celebs.CelebsList.get(8).MoviesList.get(2).getOriginal_title());
            c.moveToNext();
            img_byte=c.getBlob(i);
            img= Image_Converter.getImage(img_byte);
            iv10.setImageBitmap(img);
            ntv10.setText(celebs.CelebsList.get(9).getName());
            mtv10.setText(celebs.CelebsList.get(9).MoviesList.get(0).getOriginal_title() + "," + celebs.CelebsList.get(9).MoviesList.get(1).getOriginal_title());

        }

        final Intent i = new Intent();
        i.setClass(getActivity(), CelebrityDetailsActivity.class);
        String key = (String) b.getSerializable(Constants.API_KEY);
        i.putExtra(Constants.CELEBS_URL_API_KEY, key);
        mtv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("Profile_ID", celebs.CelebsList.get(0).getId());
                startActivity(i);
            }
        });
        mtv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("Profile_ID", celebs.CelebsList.get(1).getId());
                startActivity(i);
            }
        });
        mtv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("Profile_ID", celebs.CelebsList.get(2).getId());
                startActivity(i);
            }
        });
        mtv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("Profile_ID", celebs.CelebsList.get(3).getId());
                startActivity(i);
            }
        });
        mtv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("Profile_ID", celebs.CelebsList.get(4).getId());
                startActivity(i);
            }
        });
        mtv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("Profile_ID", celebs.CelebsList.get(5).getId());
                startActivity(i);
            }
        });
        mtv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("Profile_ID", celebs.CelebsList.get(6).getId());
                startActivity(i);
            }
        });
        mtv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("Profile_ID", celebs.CelebsList.get(7).getId());
                startActivity(i);
            }
        });
        mtv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("Profile_ID", celebs.CelebsList.get(8).getId());
                startActivity(i);
            }
        });
        mtv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i.putExtra("Profile_ID", celebs.CelebsList.get(9).getId());
                startActivity(i);
            }
        });

        return view;
    }
}
