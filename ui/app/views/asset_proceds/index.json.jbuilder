json.array!(@asset_proceds) do |asset_proced|
  json.extract! asset_proced, :id, :asset_id, :proced_id
  json.url asset_proced_url(asset_proced, format: :json)
end
