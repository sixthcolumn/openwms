class AssetProced < ActiveRecord::Base

  self.table_name = "asset_proceds"

  belongs_to :asset
  has_and_belongs_to_many  :proceds, join_table: "asset_proceds"

end
