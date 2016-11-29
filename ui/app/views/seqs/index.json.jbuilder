json.array!(@seqs) do |seq|
  json.extract! seq, :id, :seq_name, :start, :increment, :curval, :flag
  json.url seq_url(seq, format: :json)
end
