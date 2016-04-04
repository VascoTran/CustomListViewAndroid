package vuongtd.com.customviewandroid;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vuongtd on 3/26/2016.
 */
public class AppAdapter extends BaseAdapter {

    class ViewHolder {
        ImageView appIcon;
        TextView appName;
        TextView size;
        TextView download;
    }

    public ArrayList<AppItem> mlistAppInfo;
    LayoutInflater infater = null;
    private Context mContext;


    public AppAdapter(Context context, ArrayList<AppItem> apps) {
        infater = LayoutInflater.from(context);
        mContext = context;
        this.mlistAppInfo = apps;

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return mlistAppInfo.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return mlistAppInfo.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = infater.inflate(R.layout.item_listview,
                    null);
            holder = new ViewHolder();
            holder.appIcon = (ImageView) convertView
                    .findViewById(R.id.app_icon);
            holder.appName = (TextView) convertView
                    .findViewById(R.id.app_name);
            holder.size = (TextView) convertView
                    .findViewById(R.id.app_size);
            holder.download = (TextView) convertView.findViewById(R.id.download);

            holder.download.setText("Download");


            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        final AppItem item = (AppItem) getItem(position);
        if (item != null) {

            holder.appIcon.setImageResource(item.getIcon());
            holder.appName.setText(item.getName());
            holder.size.setText(item.getDes());


            holder.download.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(item.getLink()));
                    mContext.startActivity(browserIntent);

                }
            });

        }


        return convertView;
    }
}
