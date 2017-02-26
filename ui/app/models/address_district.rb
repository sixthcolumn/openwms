class AddressDistrict < ActiveRecord::Base
  belongs_to :address
  belongs_to :district
end
