json.array!(@maintorders) do |maintorder|
  json.extract! maintorder, :id, :mRID, :status, :created_by, :maintorder_id, :name_type_id
  json.url maintorder_url(maintorder, format: :json)
end
