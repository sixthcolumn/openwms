json.array!(@organizations) do |organization|
  json.extract! organization, :id, :mRid, :address_id, :phone_id
  json.url organization_url(organization, format: :json)
end
