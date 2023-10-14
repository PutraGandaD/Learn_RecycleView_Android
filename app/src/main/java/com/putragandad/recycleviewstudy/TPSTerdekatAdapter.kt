package com.putragandad.recycleviewstudy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.putragandad.recycleviewstudy.databinding.ActivityMainBinding
import com.putragandad.recycleviewstudy.databinding.RecentvisitItemBinding

class TPSTerdekatAdapter(private val TPSTerdekatList : ArrayList<TPSTerdekat>)
    : RecyclerView.Adapter<TPSTerdekatAdapter.TpsViewHolder>() {

    var onItemClick : ((TPSTerdekat) -> Unit)? = null

    class TpsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageTPS : ImageView = itemView.findViewById(R.id.iv_tps)
        val namaTPS : TextView = itemView.findViewById(R.id.tv_nama_tps)
        val jarakTPS : TextView = itemView.findViewById(R.id.tv_jarak_tps)
        val alamatTPS : TextView = itemView.findViewById(R.id.tv_alamat_tps)
        val jenisTPS : TextView = itemView.findViewById(R.id.tv_jenis_tps)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TpsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recentvisit_item
        , parent, false)
        return TpsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return TPSTerdekatList.size
    }

    override fun onBindViewHolder(holder: TpsViewHolder, position: Int) {
        val tps = TPSTerdekatList[position]
        holder.imageTPS.setImageResource(tps.image)
        holder.namaTPS.text = tps.namaTPS
        holder.jarakTPS.text = tps.jarakTPS
        holder.alamatTPS.text = tps.alamatTPS
        holder.jenisTPS.text = tps.jenisTPS

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(tps)
        }
    }
}