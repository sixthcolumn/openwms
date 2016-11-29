json.array!(@time_schedules) do |time_schedule|
  json.extract! time_schedule, :id, :type, :start_tstamp, :end_tstamp
  json.url time_schedule_url(time_schedule, format: :json)
end
