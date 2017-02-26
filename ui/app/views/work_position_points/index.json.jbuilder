json.array!(@work_position_points) do |work_position_point|
  json.extract! work_position_point, :id, :work_order_id, :sequence_num, :xposition, :yposition, :zposition
  json.url work_position_point_url(work_position_point, format: :json)
end
