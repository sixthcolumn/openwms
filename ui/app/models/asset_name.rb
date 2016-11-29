class AssetName < ActiveRecord::Base
  belongs_to :asset
  belongs_to :asset_name_type, foreign_key: "name_type_id"
end
