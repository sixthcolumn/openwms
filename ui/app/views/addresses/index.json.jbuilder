json.array!(@addresses) do |address|
  json.extract! address, :id, :sd_address_1, :sd_address_2, :sd_building_name, :sd_code, :sd_number, :sd_prefix, :sd_suffix, :sd_suite_number, :sd_type, :sd_within_town_limits_flag, :td_code, :td_country, :td_name, :td_section, :td_state_province, :directions, :td_pobox, :td_postal_code, :td_region, :county, :township_name, :subdivision, :block, :lot, :time_zone, :coord_system
  json.url address_url(address, format: :json)
end
