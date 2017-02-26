json.array!(@assets) do |asset|
  json.extract! asset, :id, :mRID, :critical_flag, :utc_number, :address_id
  json.url asset_url(asset, format: :json)
end
