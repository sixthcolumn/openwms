json.array!(@other_contactinfos) do |other_contactinfo|
  json.extract! other_contactinfo, :id, :details, :info_type
  json.url other_contactinfo_url(other_contactinfo, format: :json)
end
