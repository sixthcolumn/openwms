json.array!(@comments) do |comment|
  json.extract! comment, :id, :comment, :comment_type, :comment_subtype
  json.url comment_url(comment, format: :json)
end
