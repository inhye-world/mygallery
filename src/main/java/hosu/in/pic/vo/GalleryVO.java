package hosu.in.pic.vo;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GalleryVO {
	private int gallery_num;
	private String pic_title;
	private String board_content;
	private Timestamp board_date;
	private int board_hit;
	private int board_group;
	private int board_step;
	private int board_indent;
}
