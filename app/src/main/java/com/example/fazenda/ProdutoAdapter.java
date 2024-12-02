package com.example.fazenda;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ProdutoAdapter extends RecyclerView.Adapter<ProdutoAdapter.ProdutoViewHolder> {

    private List<Produto> produtos;

    public ProdutoAdapter(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @NonNull
    @Override
    public ProdutoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_produto, parent, false);
        return new ProdutoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProdutoViewHolder holder, int position) {
        Produto produto = produtos.get(position);
        holder.nomeProduto.setText(produto.getNome());
        holder.precoProduto.setText("R$ " + produto.getPreco());
        holder.estoqueProduto.setText("Estoque: " + produto.getEstoque());
        holder.descritivoProduto.setText(produto.getDescricao());
        holder.imagemProduto.setImageResource(produto.getImagemResId());
    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }

    public static class ProdutoViewHolder extends RecyclerView.ViewHolder {
        TextView nomeProduto, precoProduto, estoqueProduto, descritivoProduto;
        ImageView imagemProduto;

        public ProdutoViewHolder(View itemView) {
            super(itemView);
            nomeProduto = itemView.findViewById(R.id.nomeProduto);
            precoProduto = itemView.findViewById(R.id.precoProduto);
            estoqueProduto = itemView.findViewById(R.id.estoqueProduto);
            descritivoProduto = itemView.findViewById(R.id.descritivoProduto);
            imagemProduto = itemView.findViewById(R.id.imagemProduto);
        }
    }
}
