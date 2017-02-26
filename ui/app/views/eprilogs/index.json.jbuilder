json.array!(@eprilogs) do |eprilog|
  json.extract! eprilog, :id, :address, :contentType, :create_date, :data, :encoding, :faultCode, :header, :httpMethod, :message, :messageId, :operation, :payload, :responseCode, :resultCode, :INTERFACE_ID, :stage
  json.url eprilog_url(eprilog, format: :json)
end
